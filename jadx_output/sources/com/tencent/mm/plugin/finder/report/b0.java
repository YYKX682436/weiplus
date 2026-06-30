package com.tencent.mm.plugin.finder.report;

/* loaded from: classes2.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.report.b0 f124961a = new com.tencent.mm.plugin.finder.report.b0();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Vector f124962b = new java.util.Vector();

    /* renamed from: c, reason: collision with root package name */
    public static final mv2.v0 f124963c = new com.tencent.mm.plugin.finder.report.a0();

    public final void a(com.tencent.mm.plugin.finder.storage.x80 draftItem) {
        kotlin.jvm.internal.o.g(draftItem, "draftItem");
        try {
            draftItem.w0();
            com.tencent.mm.plugin.finder.storage.x80 x80Var = new com.tencent.mm.plugin.finder.storage.x80();
            x80Var.field_localId = draftItem.field_localId;
            x80Var.field_createTime = draftItem.field_createTime;
            x80Var.field_localFlag = draftItem.field_localFlag;
            x80Var.field_finderItem = draftItem.field_finderItem;
            x80Var.field_objectType = draftItem.field_objectType;
            x80Var.field_postIntent = draftItem.field_postIntent;
            x80Var.field_originMvInfo = draftItem.field_originMvInfo;
            x80Var.field_objectId = draftItem.field_objectId;
            x80Var.field_markDeleted = draftItem.field_markDeleted;
            x80Var.field_version = draftItem.field_version;
            x80Var.field_dbversion = draftItem.field_dbversion;
            java.util.Vector vector = f124962b;
            kz5.h0.B(vector, new com.tencent.mm.plugin.finder.report.z(x80Var));
            vector.add(x80Var);
        } catch (java.lang.Throwable unused) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:124:0x03ef, code lost:
    
        if (r0 == null) goto L118;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(com.tencent.mm.plugin.finder.storage.FinderItem r39, boolean r40) {
        /*
            Method dump skipped, instructions count: 1633
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.report.b0.b(com.tencent.mm.plugin.finder.storage.FinderItem, boolean):void");
    }
}
