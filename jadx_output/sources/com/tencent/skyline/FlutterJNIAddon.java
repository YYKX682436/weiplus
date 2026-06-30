package com.tencent.skyline;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tencent/skyline/FlutterJNIAddon;", "", "flutterJNI", "Lio/flutter/embedding/engine/FlutterJNI;", "taskRunnerJNI", "Lio/flutter/embedding/engine/TaskRunnerJNI;", "(Lio/flutter/embedding/engine/FlutterJNI;Lio/flutter/embedding/engine/TaskRunnerJNI;)V", "getFlutterJNI", "()Lio/flutter/embedding/engine/FlutterJNI;", "getTaskRunnerJNI", "()Lio/flutter/embedding/engine/TaskRunnerJNI;", "skyline_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class FlutterJNIAddon {
    private final io.flutter.embedding.engine.FlutterJNI flutterJNI;
    private final io.flutter.embedding.engine.TaskRunnerJNI taskRunnerJNI;

    public FlutterJNIAddon(io.flutter.embedding.engine.FlutterJNI flutterJNI, io.flutter.embedding.engine.TaskRunnerJNI taskRunnerJNI) {
        kotlin.jvm.internal.o.g(flutterJNI, "flutterJNI");
        kotlin.jvm.internal.o.g(taskRunnerJNI, "taskRunnerJNI");
        this.flutterJNI = flutterJNI;
        this.taskRunnerJNI = taskRunnerJNI;
    }

    public final io.flutter.embedding.engine.FlutterJNI getFlutterJNI() {
        return this.flutterJNI;
    }

    public final io.flutter.embedding.engine.TaskRunnerJNI getTaskRunnerJNI() {
        return this.taskRunnerJNI;
    }
}
