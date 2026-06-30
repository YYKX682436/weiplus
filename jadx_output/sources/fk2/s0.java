package fk2;

/* loaded from: classes3.dex */
public final class s0 extends we2.o {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f263469m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f263470n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f263471o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(we2.a liveContext) {
        super(liveContext);
        kotlin.jvm.internal.o.g(liveContext, "liveContext");
        this.f263469m = "CommentItemGiftFunding";
        this.f263470n = jz5.h.b(fk2.o0.f263442d);
        this.f263471o = jz5.h.b(fk2.p0.f263450d);
    }

    @Override // we2.o
    public void d(android.content.Context context, bm2.h1 holder, dk2.zf msg, int i17) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(msg, "msg");
        super.d(context, holder, msg, i17);
        java.lang.Object D = msg.D();
        boolean z17 = D instanceof r45.di1;
        com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView = holder.f21927e;
        if (z17) {
            android.view.View view = holder.itemView;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            r45.di1 di1Var = (r45.di1) D;
            sb6.append(di1Var.getString(0));
            sb6.append('_');
            sb6.append(di1Var.getString(1));
            sb6.append('_');
            sb6.append(di1Var.getInteger(2));
            view.setTag(sb6.toString());
            android.content.Context context2 = holder.itemView.getContext();
            kotlin.jvm.internal.o.f(context2, "getContext(...)");
            java.lang.String string = di1Var.getString(1);
            int integer = di1Var.getInteger(2);
            r45.xn1 r17 = msg.r();
            java.util.LinkedList list = r17 != null ? r17.getList(11) : null;
            gm2.c1 c1Var = gm2.c1.f273320a;
            java.util.List r18 = gm2.c1.r(c1Var, list, new int[]{2, 4, 6}, null, null, 4, holder.f21927e, null, 0, 0, null, null, 1996, null);
            java.lang.String str2 = q() + c1Var.o(r18);
            if (integer == 1) {
                str = str2 + string + ' ';
            } else {
                str = str2 + ' ' + string;
            }
            jz5.l lVar = integer == 1 ? new jz5.l(java.lang.Integer.valueOf(str.length() - 1), java.lang.Integer.valueOf(str.length())) : new jz5.l(java.lang.Integer.valueOf(str2.length()), java.lang.Integer.valueOf(str2.length() + 1));
            ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).getClass();
            com.tencent.mm.pluginsdk.ui.span.f0 f0Var = new com.tencent.mm.pluginsdk.ui.span.f0(com.tencent.mm.pluginsdk.ui.span.c0.i(context2, str));
            gm2.u uVar = gm2.v.f273498f;
            java.lang.String q17 = q();
            kotlin.jvm.internal.o.f(q17, "<get-giftStr>(...)");
            android.graphics.drawable.Drawable a17 = gm2.u.a(uVar, q17, 0.0f, 0.0f, 6, null);
            java.lang.String q18 = q();
            kotlin.jvm.internal.o.f(q18, "<get-giftStr>(...)");
            float f17 = gm2.w.f273511k;
            f0Var.b(new gm2.v(a17, new gm2.w(q18, f17, f17, com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_3), gm2.w.f273509i, com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.f479549ab0), gm2.w.f273510j, 0.0f, 128, null)), q(), 0, 33);
            int length = q().length();
            java.util.Iterator it = r18.iterator();
            while (it.hasNext()) {
                int i18 = length + 1;
                f0Var.c((android.text.style.ImageSpan) it.next(), length, i18, 33);
                length = i18;
            }
            java.lang.String string2 = di1Var.getString(0);
            if (string2 == null) {
                string2 = "";
            }
            ce2.i iVar = (ce2.i) dk2.u7.f234185e.get(string2);
            java.lang.String str3 = iVar != null ? iVar.field_thumbnailFileUrl : null;
            java.lang.String str4 = str3 != null ? str3 : "";
            android.content.Context context3 = holder.itemView.getContext();
            mMNeat7extView.b(f0Var);
            wo0.c a18 = new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f353936a.e(zy2.b6.class).c(mn2.i4.class))).H).getValue()).a(new mn2.n(str4, null, 2, null));
            a18.f447873d = new fk2.r0(di1Var, holder, this, context3, lVar, f0Var);
            a18.f();
            holder.f21929g.setBackground(context3.getResources().getDrawable(com.tencent.mm.R.drawable.a1k));
        } else {
            com.tencent.mars.xlog.Log.i(this.f263469m, "invalid type");
        }
        android.view.ViewParent parent = mMNeat7extView.getParent();
        kotlin.jvm.internal.o.e(parent, "null cannot be cast to non-null type android.widget.RelativeLayout");
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) parent;
        relativeLayout.setPadding(0, relativeLayout.getPaddingTop(), relativeLayout.getPaddingRight(), relativeLayout.getPaddingBottom());
    }

    @Override // we2.o
    public dk2.zf e(r45.ch1 msg) {
        kotlin.jvm.internal.o.g(msg, "msg");
        return new fk2.j3(msg);
    }

    @Override // we2.o
    public int n() {
        return 20098;
    }

    public final java.lang.String q() {
        return (java.lang.String) ((jz5.n) this.f263471o).getValue();
    }
}
