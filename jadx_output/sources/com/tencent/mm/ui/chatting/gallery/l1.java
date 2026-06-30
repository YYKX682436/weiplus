package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes4.dex */
public class l1 implements m3.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f201168a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f201169b;

    public l1(boolean z17, android.content.Context context) {
        this.f201168a = z17;
        this.f201169b = context;
    }

    @Override // m3.a
    public void accept(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        if (this.f201168a && str == null) {
            android.content.Context context = this.f201169b;
            com.tencent.mm.platformtools.ExportFileUtil.m(context, context.getString(com.tencent.mm.R.string.i87));
        }
    }
}
