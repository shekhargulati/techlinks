<!DOCTYPE html>
<html ng-app="getbookmarks">
<head>
    <meta http-equiv="content-type" content="text/html; charset=utf-8"/>
    <link rel="stylesheet" href="css/bootstrap.css"/>
    <link rel="stylesheet" href="css/toastr.css"/>
    <style>
        body {
            padding-top: 60px;
        }
    </style>
    <title>GetBookmarks : Submit Story</title>
</head>
<body>
<div class="navbar navbar-inverse navbar-fixed-top">
    <div class="navbar-inner">
        <div class="container">
            <button type="button" class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="brand" href="#">GetBookmarks</a>

        </div>
    </div>
</div>

<div class="container" ng-view>

</div>

<script src="js/jquery-1.9.1.js"></script>
<script src="js/bootstrap.js"></script>
<script src="js/angular.js"></script>
<script src="js/angular-resource.js"></script>
<script src="js/toastr.js"></script>
<script src="js/app.js"></script>
</body>
</html>
