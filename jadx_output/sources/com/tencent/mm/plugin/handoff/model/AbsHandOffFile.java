package com.tencent.mm.plugin.handoff.model;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/handoff/model/AbsHandOffFile;", "Lcom/tencent/mm/plugin/handoff/model/HandOff;", "Companion", "e73/a", "handoff-lib_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public abstract class AbsHandOffFile extends com.tencent.mm.plugin.handoff.model.HandOff {
    public static final e73.a Companion = new e73.a(null);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbsHandOffFile(android.os.Parcel source) {
        super(source);
        kotlin.jvm.internal.o.g(source, "source");
    }

    public abstract int getFileStatus();

    public abstract java.lang.String getFullPath();

    public abstract long getSize();

    public abstract void saveToMultiTaskInfo(com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo);

    public abstract void setFileStatus(int i17);

    public abstract void setFullPath(java.lang.String str);

    public abstract void setSource(int i17);

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AbsHandOffFile(int r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, long r19, int r21, kotlin.jvm.internal.i r22) {
        /*
            r13 = this;
            r0 = r21 & 16
            if (r0 == 0) goto L14
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "toString(...)"
            kotlin.jvm.internal.o.f(r0, r1)
            r7 = r0
            goto L16
        L14:
            r7 = r18
        L16:
            r0 = r21 & 32
            if (r0 == 0) goto L20
            long r0 = java.lang.System.currentTimeMillis()
            r8 = r0
            goto L22
        L20:
            r8 = r19
        L22:
            java.lang.String r0 = "from"
            r1 = r15
            kotlin.jvm.internal.o.g(r15, r0)
            java.lang.String r0 = "to"
            r5 = r16
            kotlin.jvm.internal.o.g(r5, r0)
            java.lang.String r0 = "key"
            r6 = r17
            kotlin.jvm.internal.o.g(r6, r0)
            java.lang.String r0 = "id"
            kotlin.jvm.internal.o.g(r7, r0)
            r10 = 0
            r11 = 64
            r12 = 0
            r2 = r13
            r3 = r14
            r4 = r15
            r2.<init>(r3, r4, r5, r6, r7, r8, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.handoff.model.AbsHandOffFile.<init>(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, int, kotlin.jvm.internal.i):void");
    }
}
