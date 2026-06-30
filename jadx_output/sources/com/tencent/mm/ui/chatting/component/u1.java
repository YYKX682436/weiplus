package com.tencent.mm.ui.chatting.component;

/* loaded from: classes11.dex */
public class u1 implements o65.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f200041a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f200042b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f200043c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f200044d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f200045e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.q2 f200046f;

    public u1(com.tencent.mm.ui.chatting.component.q2 q2Var, boolean z17, int i17, com.tencent.mm.storage.f9 f9Var, java.util.LinkedList linkedList, java.util.LinkedList linkedList2) {
        this.f200046f = q2Var;
        this.f200041a = z17;
        this.f200042b = i17;
        this.f200043c = f9Var;
        this.f200044d = linkedList;
        this.f200045e = linkedList2;
    }

    @Override // o65.c, o65.b
    /* renamed from: b */
    public void a(int i17, int i18, java.lang.String str, o65.c cVar) {
        com.tencent.mm.ui.chatting.component.q2 q2Var = this.f200046f;
        android.app.ProgressDialog progressDialog = q2Var.f199739h;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        if (i17 == 0 && i18 == 0) {
            return;
        }
        if (i18 == -2024) {
            tm.a b17 = tm.a.b(str);
            if (b17 != null) {
                b17.c(q2Var.f198580d.f460717l.getContext(), null, null);
                return;
            }
            db5.e1.E(q2Var.f198580d.f460717l.getContext(), q2Var.f198580d.s().getString(com.tencent.mm.R.string.i4k), null, q2Var.f198580d.s().getString(com.tencent.mm.R.string.i4l), false, new com.tencent.mm.ui.chatting.component.s1(this));
        } else {
            db5.e1.E(q2Var.f198580d.f460717l.getContext(), this.f200041a ? q2Var.f198580d.s().getString(com.tencent.mm.R.string.igo) : q2Var.f198580d.s().getString(com.tencent.mm.R.string.i4u), null, q2Var.f198580d.s().getString(com.tencent.mm.R.string.f490507x1), false, new com.tencent.mm.ui.chatting.component.t1(this));
        }
        if (this.f200042b == 1) {
            q2Var.w0(this.f200043c, q2Var.f199744p.intValue(), this.f200044d, this.f200045e.size(), 1, 3, (java.lang.String) this.f200044d.get(0));
        }
    }
}
