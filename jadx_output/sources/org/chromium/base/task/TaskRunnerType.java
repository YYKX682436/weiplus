package org.chromium.base.task;

@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
/* loaded from: classes4.dex */
public @interface TaskRunnerType {
    public static final int BASE = 0;
    public static final int SEQUENCED = 1;
    public static final int SINGLE_THREAD = 2;
}
