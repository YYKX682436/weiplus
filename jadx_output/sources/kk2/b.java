package kk2;

/* loaded from: classes3.dex */
public final class b implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kk2.d f308482a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f308483b;

    public b(kk2.d dVar, java.lang.String str) {
        this.f308482a = dVar;
        this.f308483b = str;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("reserve cgi: errCode=");
        sb6.append(fVar.f70616b);
        sb6.append(", errType=");
        sb6.append(fVar.f70615a);
        sb6.append(", noticeId=");
        kk2.d dVar = this.f308482a;
        sb6.append(dVar.f308486i.getString(4));
        sb6.append(", anchorUsername=");
        java.lang.String str = this.f308483b;
        sb6.append(str);
        com.tencent.mars.xlog.Log.i("LiveNoticeGuidePanel", sb6.toString());
        int i17 = fVar.f70616b;
        android.content.Context context = dVar.f118381d;
        r45.h32 h32Var = dVar.f308486i;
        if (i17 == 0 && fVar.f70615a == 0) {
            h32Var.set(1, 0);
            com.tencent.mm.plugin.finder.feed.model.i1 i1Var = com.tencent.mm.plugin.finder.feed.model.i1.f107930a;
            java.lang.String string = h32Var.getString(4);
            if (string == null) {
                string = "";
            }
            r45.h32 e17 = i1Var.e(str, string);
            if (e17 != null) {
                e17.set(1, java.lang.Integer.valueOf(h32Var.getInteger(1)));
            } else {
                java.lang.String string2 = h32Var.getString(4);
                if (string2 != null) {
                    i1Var.a(str, string2, h32Var);
                }
            }
            android.widget.Toast makeText = db5.t7.makeText(context, context.getString(com.tencent.mm.R.string.e0j), 0);
            makeText.setGravity(17, 0, 0);
            makeText.show();
        } else {
            db5.t7.makeText(context, com.tencent.mm.R.string.msg_net_error, 0).show();
        }
        java.lang.String string3 = h32Var.getString(4);
        dVar.y(2, 2, string3 != null ? string3 : "");
        dVar.a();
        ((df2.wv) dVar.f308485h).a();
        return jz5.f0.f302826a;
    }
}
