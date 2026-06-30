package com.tencent.thumbplayer.log;

/* loaded from: classes16.dex */
public class TPLoggerContext {
    public static final java.lang.String DEFAULT_TAG = "TPLogger";
    public static final java.lang.String PREFIX_THUMB_PLAYER = "ThumbPlayer";
    private java.lang.String classId;
    private java.lang.String commentScene;
    private java.lang.String model;
    private java.lang.String prefix;
    private java.lang.String stack;
    private java.lang.String tag;
    private java.lang.String taskId;

    public TPLoggerContext(java.lang.String str) {
        this(str, "", "", "");
    }

    private void buildTag() {
        this.tag = this.prefix;
        if (!android.text.TextUtils.isEmpty(this.classId)) {
            this.tag += "_C" + this.classId;
        }
        if (!android.text.TextUtils.isEmpty(this.taskId)) {
            this.tag += "_T" + this.taskId;
        }
        if (!android.text.TextUtils.isEmpty(this.model)) {
            this.tag += "_" + this.model;
        }
        if (android.text.TextUtils.isEmpty(this.commentScene)) {
            return;
        }
        this.tag += "_" + this.commentScene;
    }

    public java.lang.String getClassId() {
        return this.classId;
    }

    public java.lang.String getCommentScene() {
        return this.commentScene;
    }

    public java.lang.String getModel() {
        return this.model;
    }

    public java.lang.String getPrefix() {
        return this.prefix;
    }

    public java.lang.String getStack() {
        return this.stack;
    }

    public java.lang.String getTag() {
        return this.tag;
    }

    public java.lang.String getTaskId() {
        return this.taskId;
    }

    public void setTaskId(java.lang.String str) {
        this.taskId = str;
        buildTag();
    }

    public java.lang.String toString() {
        return "TPLoggerContext{prefix='" + this.prefix + "', classId='" + this.classId + "', taskId='" + this.taskId + "', model='" + this.model + "', tag='" + this.tag + "', commentScene='" + this.commentScene + "'}";
    }

    public void update(com.tencent.thumbplayer.log.TPLoggerContext tPLoggerContext, java.lang.String str) {
        if (tPLoggerContext != null) {
            this.prefix = tPLoggerContext.prefix;
            this.classId = tPLoggerContext.classId;
            this.taskId = tPLoggerContext.taskId;
            this.stack = tPLoggerContext.stack;
            this.commentScene = tPLoggerContext.commentScene;
        } else {
            this.prefix = "";
            this.classId = "";
            this.taskId = "";
        }
        this.model = str;
        buildTag();
    }

    public TPLoggerContext(com.tencent.thumbplayer.log.TPLoggerContext tPLoggerContext) {
        this(tPLoggerContext.prefix, tPLoggerContext.classId, tPLoggerContext.taskId, tPLoggerContext.model);
    }

    public TPLoggerContext(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        this(str, str2, str3, str4, "");
    }

    public TPLoggerContext(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        this.tag = DEFAULT_TAG;
        this.stack = "";
        this.prefix = str;
        this.classId = str2;
        this.taskId = str3;
        this.model = str4;
        this.commentScene = str5;
        buildTag();
        if (com.tencent.thumbplayer.config.TPPlayerConfig.enableStackTrace) {
            try {
                this.stack = android.util.Log.getStackTraceString(new java.lang.Exception());
            } catch (java.lang.Exception unused) {
            }
        }
    }

    public TPLoggerContext(com.tencent.thumbplayer.log.TPLoggerContext tPLoggerContext, java.lang.String str) {
        this.prefix = "";
        this.classId = "";
        this.taskId = "";
        this.model = "";
        this.tag = DEFAULT_TAG;
        this.stack = "";
        this.commentScene = "";
        update(tPLoggerContext, str);
    }
}
