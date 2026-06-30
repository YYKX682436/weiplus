package te2;

/* loaded from: classes.dex */
public final class b5 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ te2.p8 f417897a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f417898b;

    public b5(te2.p8 p8Var, kotlin.coroutines.Continuation continuation) {
        this.f417897a = p8Var;
        this.f417898b = continuation;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        boolean z17 = true;
        boolean z18 = fVar != null && fVar.f70615a == 0;
        kotlin.coroutines.Continuation continuation = this.f417898b;
        te2.p8 p8Var = this.f417897a;
        if (z18 && fVar.f70615a == 0) {
            java.util.Iterator it = ((r45.m02) fVar.f70618d).getList(1).iterator();
            while (it.hasNext()) {
                r45.ix0 ix0Var = (r45.ix0) it.next();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setCoverImage ret:");
                kotlin.jvm.internal.o.d(ix0Var);
                sb6.append(pm0.b0.g(ix0Var));
                com.tencent.mars.xlog.Log.i("FinderLiveNoticeQRCodeUIC", sb6.toString());
                if (ix0Var.getInteger(0) == 11) {
                    if (ix0Var.getInteger(1) != 0) {
                        java.lang.String string = ix0Var.getString(2);
                        if (string != null && string.length() != 0) {
                            z17 = false;
                        }
                        if (z17) {
                            string = p8Var.getContext().getResources().getString(com.tencent.mm.R.string.dq_);
                        }
                        db5.t7.i(p8Var.getContext(), string, com.tencent.mm.R.raw.icons_filled_close);
                        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                        continuation.resumeWith(kotlin.Result.m521constructorimpl(java.lang.Boolean.FALSE));
                    } else {
                        kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                        continuation.resumeWith(kotlin.Result.m521constructorimpl(java.lang.Boolean.TRUE));
                    }
                    return jz5.f0.f302826a;
                }
            }
        } else {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("mod cover image errType ");
            sb7.append(fVar != null ? java.lang.Integer.valueOf(fVar.f70615a) : null);
            sb7.append(",errCode:");
            sb7.append(fVar != null ? java.lang.Integer.valueOf(fVar.f70616b) : null);
            sb7.append(",errMsg:");
            sb7.append(fVar != null ? fVar.f70617c : null);
            com.tencent.mars.xlog.Log.e("FinderLiveNoticeQRCodeUIC", sb7.toString());
            db5.t7.i(p8Var.getContext(), p8Var.getContext().getResources().getString(com.tencent.mm.R.string.dq_), com.tencent.mm.R.raw.icons_filled_close);
        }
        kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
        continuation.resumeWith(kotlin.Result.m521constructorimpl(java.lang.Boolean.FALSE));
        return jz5.f0.f302826a;
    }
}
