package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes4.dex */
public class t1 implements m3.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f201380a;

    public t1(android.content.Context context) {
        this.f201380a = context;
    }

    @Override // m3.a
    public void accept(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        android.content.Context context = this.f201380a;
        if (str == null) {
            com.tencent.mm.platformtools.ExportFileUtil.m(context, context.getString(com.tencent.mm.R.string.i88));
        } else {
            if (android.text.TextUtils.isEmpty(str)) {
                return;
            }
            com.tencent.mm.platformtools.ExportFileUtil.m(context, context.getString(com.tencent.mm.R.string.f491159c61, q75.c.d()));
        }
    }
}
