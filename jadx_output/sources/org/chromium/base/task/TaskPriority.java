package org.chromium.base.task;

@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
/* loaded from: classes6.dex */
public @interface TaskPriority {
    public static final int BEST_EFFORT = 0;
    public static final int HIGHEST = 2;
    public static final int LOWEST = 0;
    public static final int USER_BLOCKING = 2;
    public static final int USER_VISIBLE = 1;
}
