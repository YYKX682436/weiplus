package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public class y0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pointers.PBool f208250d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f208251e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f208252f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f208253g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f208254h;

    public y0(com.tencent.mm.pointers.PBool pBool, android.content.Context context, boolean z17, java.lang.String str, boolean z18) {
        this.f208250d = pBool;
        this.f208251e = context;
        this.f208252f = z17;
        this.f208253g = str;
        this.f208254h = z18;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        this.f208250d.value = true;
        android.content.Context context = this.f208251e;
        boolean z17 = this.f208252f;
        java.lang.String str = this.f208253g;
        com.tencent.mm.ui.conversation.t1.a(context, z17, str);
        if (this.f208254h) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14553, 0, 4, str);
        }
    }
}
