package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class o1 implements com.tencent.mm.ui.widget.dialog.c1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.c3 f204958d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f204959e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f204960f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f204961g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f204962h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f204963i;

    public o1(com.tencent.mm.ui.chatting.viewitems.c3 c3Var, java.lang.String str, int i17, boolean z17, java.lang.String str2, java.lang.String str3) {
        this.f204958d = c3Var;
        this.f204959e = str;
        this.f204960f = i17;
        this.f204961g = z17;
        this.f204962h = str2;
        this.f204963i = str3;
    }

    @Override // com.tencent.mm.ui.widget.dialog.c1
    public void onDismiss() {
        if (this.f204958d.f203687a) {
            return;
        }
        kn.k0.c(this.f204959e, 1, this.f204960f, this.f204961g ? 1 : 2, 1, this.f204962h, this.f204963i);
    }
}
