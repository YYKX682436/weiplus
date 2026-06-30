package fk2;

/* loaded from: classes3.dex */
public abstract class x0 extends we2.o {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f263511m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f263512n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f263513o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(we2.a liveContext) {
        super(liveContext);
        kotlin.jvm.internal.o.g(liveContext, "liveContext");
        this.f263511m = "CommentItemGiftWall";
        this.f263512n = jz5.h.b(fk2.t0.f263480d);
        this.f263513o = jz5.h.b(fk2.u0.f263490d);
    }

    @Override // we2.o
    public void d(android.content.Context context, bm2.h1 holder, dk2.zf msg, int i17) {
        java.lang.String string;
        java.lang.String string2;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(msg, "msg");
        super.d(context, holder, msg, i17);
        java.lang.Object D = msg.D();
        java.lang.String str = "";
        if (D instanceof r45.pi1) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            r45.pi1 pi1Var = (r45.pi1) D;
            r45.kv1 kv1Var = (r45.kv1) pi1Var.getCustom(0);
            if (kv1Var != null && (string2 = kv1Var.getString(0)) != null) {
                str = string2;
            }
            sb6.append(str);
            sb6.append('_');
            sb6.append(pi1Var.getString(1));
            java.lang.String sb7 = sb6.toString();
            holder.itemView.setTag(sb7);
            android.content.Context context2 = holder.itemView.getContext();
            kotlin.jvm.internal.o.f(context2, "getContext(...)");
            r((r45.kv1) pi1Var.getCustom(0), s(context2, pi1Var.getString(1), msg, holder), holder, sb7);
        } else if (D instanceof r45.wi1) {
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
            r45.wi1 wi1Var = (r45.wi1) D;
            r45.kv1 kv1Var2 = (r45.kv1) wi1Var.getCustom(0);
            if (kv1Var2 != null && (string = kv1Var2.getString(0)) != null) {
                str = string;
            }
            sb8.append(str);
            sb8.append('_');
            sb8.append(wi1Var.getString(1));
            java.lang.String sb9 = sb8.toString();
            holder.itemView.setTag(sb9);
            android.content.Context context3 = holder.itemView.getContext();
            kotlin.jvm.internal.o.f(context3, "getContext(...)");
            r((r45.kv1) wi1Var.getCustom(0), s(context3, wi1Var.getString(1), msg, holder), holder, sb9);
        } else {
            com.tencent.mars.xlog.Log.i(this.f263511m, "invalid type");
        }
        android.view.ViewParent parent = holder.f21927e.getParent();
        kotlin.jvm.internal.o.e(parent, "null cannot be cast to non-null type android.widget.RelativeLayout");
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) parent;
        relativeLayout.setPadding(0, relativeLayout.getPaddingTop(), relativeLayout.getPaddingRight(), relativeLayout.getPaddingBottom());
        holder.f21929g.setBackground(context.getResources().getDrawable(com.tencent.mm.R.drawable.a1k));
    }

    @Override // we2.o
    public dk2.zf e(r45.ch1 msg) {
        kotlin.jvm.internal.o.g(msg, "msg");
        return new dk2.v7(msg);
    }

    public final java.lang.String q() {
        return (java.lang.String) ((jz5.n) this.f263513o).getValue();
    }

    public final void r(r45.kv1 kv1Var, com.tencent.mm.pluginsdk.ui.span.f0 f0Var, bm2.h1 h1Var, java.lang.String str) {
        java.lang.String str2;
        if (kv1Var == null || (str2 = kv1Var.getString(2)) == null) {
            str2 = "";
        }
        android.content.Context context = h1Var.itemView.getContext();
        h1Var.f21927e.b(f0Var);
        wo0.c a17 = new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f353936a.e(zy2.b6.class).c(mn2.i4.class))).H).getValue()).a(new mn2.n(str2, null, 2, null));
        fk2.w0 w0Var = new fk2.w0(h1Var, str, this, context, f0Var);
        a17.getClass();
        a17.f447873d = w0Var;
        a17.f();
    }

    public final com.tencent.mm.pluginsdk.ui.span.f0 s(android.content.Context context, java.lang.String str, dk2.zf zfVar, bm2.h1 h1Var) {
        r45.xn1 r17 = zfVar.r();
        java.util.LinkedList list = r17 != null ? r17.getList(11) : null;
        gm2.c1 c1Var = gm2.c1.f273320a;
        java.util.List r18 = gm2.c1.r(c1Var, list, new int[]{2, 4, 6}, null, null, 4, h1Var.f21927e, null, 0, 0, null, null, 1996, null);
        java.lang.String str2 = q() + c1Var.o(r18);
        ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).getClass();
        com.tencent.mm.pluginsdk.ui.span.f0 f0Var = new com.tencent.mm.pluginsdk.ui.span.f0(com.tencent.mm.pluginsdk.ui.span.c0.i(context, str2 + str + ' '));
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
            int i17 = length + 1;
            f0Var.c((android.text.style.ImageSpan) it.next(), length, i17, 33);
            length = i17;
        }
        return f0Var;
    }
}
