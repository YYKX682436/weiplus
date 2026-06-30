package com.tencent.mm.ui.chatting.component;

/* loaded from: classes11.dex */
public class r1 implements o65.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f199809a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f199810b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f199811c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f199812d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f199813e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.q2 f199814f;

    public r1(com.tencent.mm.ui.chatting.component.q2 q2Var, boolean z17, int i17, com.tencent.mm.storage.f9 f9Var, java.util.LinkedList linkedList, java.util.LinkedList linkedList2) {
        this.f199814f = q2Var;
        this.f199809a = z17;
        this.f199810b = i17;
        this.f199811c = f9Var;
        this.f199812d = linkedList;
        this.f199813e = linkedList2;
    }

    @Override // o65.c, o65.b
    /* renamed from: b */
    public void a(int i17, int i18, java.lang.String str, o65.c cVar) {
        com.tencent.mm.ui.chatting.component.q2 q2Var = this.f199814f;
        android.app.ProgressDialog progressDialog = q2Var.f199739h;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        db5.e1.T(q2Var.f198580d.g(), this.f199809a ? q2Var.f198580d.s().getString(com.tencent.mm.R.string.igm) : q2Var.f198580d.s().getString(com.tencent.mm.R.string.i4o));
        if (this.f199810b == 1) {
            q2Var.w0(this.f199811c, q2Var.f199744p.intValue(), this.f199812d, this.f199813e.size(), 1, 2, (java.lang.String) this.f199812d.get(0));
        }
    }
}
