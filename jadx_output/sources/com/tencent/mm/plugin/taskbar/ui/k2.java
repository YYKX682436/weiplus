package com.tencent.mm.plugin.taskbar.ui;

/* loaded from: classes8.dex */
public final class k2 implements java.util.Comparator {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.taskbar.ui.k2 f172638d = new com.tencent.mm.plugin.taskbar.ui.k2();

    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        long j17 = ((com.tencent.mm.plugin.multitask.model.MultiTaskInfo) obj2).field_updateTime - ((com.tencent.mm.plugin.multitask.model.MultiTaskInfo) obj).field_updateTime;
        if (j17 == 0) {
            return 0;
        }
        return j17 > 0 ? 1 : -1;
    }
}
