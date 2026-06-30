package we2;

/* loaded from: classes3.dex */
public abstract class o {

    /* renamed from: i, reason: collision with root package name */
    public static final we2.i f445236i = new we2.i(null);

    /* renamed from: j, reason: collision with root package name */
    public static final jz5.g f445237j = jz5.h.b(we2.h.f445228d);

    /* renamed from: k, reason: collision with root package name */
    public static final jz5.g f445238k = jz5.h.b(we2.g.f445227d);

    /* renamed from: l, reason: collision with root package name */
    public static final jz5.g f445239l;

    /* renamed from: a, reason: collision with root package name */
    public final we2.a f445240a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f445241b;

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f445242c;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f445243d;

    /* renamed from: e, reason: collision with root package name */
    public final int f445244e;

    /* renamed from: f, reason: collision with root package name */
    public final android.text.style.ForegroundColorSpan f445245f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f445246g;

    /* renamed from: h, reason: collision with root package name */
    public final int f445247h;

    static {
        jz5.h.b(we2.f.f445226d);
        f445239l = jz5.h.b(we2.e.f445225d);
    }

    public o(we2.a commentItemDependency) {
        kotlin.jvm.internal.o.g(commentItemDependency, "commentItemDependency");
        this.f445240a = commentItemDependency;
        this.f445241b = "FinderLiveCommentItem";
        this.f445242c = jz5.h.b(we2.k.f445230d);
        this.f445243d = jz5.h.b(we2.j.f445229d);
        int color = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.f479222ta);
        this.f445244e = color;
        this.f445245f = new android.text.style.ForegroundColorSpan(color);
        this.f445246g = jz5.h.b(we2.n.f445235d);
        this.f445247h = zl2.r4.f473950a.w1() ? 17 : 14;
    }

    public final com.tencent.mm.pluginsdk.ui.span.f0 a(android.content.Context context, java.util.List spanItemList) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(spanItemList, "spanItemList");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.util.ArrayList<we2.m> arrayList = new java.util.ArrayList();
        java.util.Iterator it = spanItemList.iterator();
        while (it.hasNext()) {
            we2.d dVar = (we2.d) it.next();
            if (dVar != null) {
                int length = sb6.length();
                sb6.append(dVar.f445222a);
                arrayList.add(new we2.m(length, sb6.length(), dVar));
            }
        }
        java.lang.String sb7 = sb6.toString();
        kotlin.jvm.internal.o.f(sb7, "toString(...)");
        ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).getClass();
        com.tencent.mm.pluginsdk.ui.span.f0 f0Var = new com.tencent.mm.pluginsdk.ui.span.f0(new android.text.SpannableString(com.tencent.mm.pluginsdk.ui.span.c0.i(context, sb7)));
        for (we2.m mVar : arrayList) {
            we2.d dVar2 = mVar.f445234c;
            yz5.q qVar = dVar2.f445224c;
            int i17 = mVar.f445233b;
            int i18 = mVar.f445232a;
            if (qVar != null) {
                qVar.invoke(f0Var, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17));
            } else {
                java.lang.Object obj = dVar2.f445223b;
                if (obj != null) {
                    f0Var.c(obj, i18, i17, 33);
                }
            }
        }
        return f0Var;
    }

    public final java.lang.String b(java.lang.String anchorTag, java.util.List list, java.lang.String userTag, java.lang.String str) {
        kotlin.jvm.internal.o.g(anchorTag, "anchorTag");
        kotlin.jvm.internal.o.g(userTag, "userTag");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        if (anchorTag.length() > 0) {
            sb6.append(anchorTag);
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("anchorTag:");
            sb7.append(anchorTag);
            sb7.append(',');
        }
        int size = list != null ? list.size() : 0;
        for (int i17 = 0; i17 < size; i17++) {
            sb6.append(" ");
        }
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder("badgeSpanSize:");
        sb8.append(size);
        sb8.append(',');
        sb6.append(userTag);
        java.lang.StringBuilder sb9 = new java.lang.StringBuilder("userTag:");
        sb9.append(userTag);
        sb9.append(',');
        sb6.append(str == null ? "" : str);
        java.lang.StringBuilder sb10 = new java.lang.StringBuilder("content:");
        sb10.append(str);
        sb10.append('!');
        java.lang.String sb11 = sb6.toString();
        kotlin.jvm.internal.o.f(sb11, "toString(...)");
        zl2.r4.f473950a.M2(this.f445241b, "#createTextMsg result=".concat(sb11));
        return sb11;
    }

    public yz5.l c(dk2.zf msg) {
        kotlin.jvm.internal.o.g(msg, "msg");
        return null;
    }

    public void d(android.content.Context context, bm2.h1 holder, dk2.zf msg, int i17) {
        java.util.LinkedList list;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(msg, "msg");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("#fillItem name=");
        sb6.append(msg.k());
        sb6.append(" content=");
        sb6.append(msg.j());
        sb6.append(" badge=");
        r45.xn1 r17 = msg.r();
        if (r17 != null && (list = r17.getList(11)) != null) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                sb6.append(java.lang.String.valueOf(((r45.yl1) it.next()).getInteger(0)));
                sb6.append("|");
            }
        }
        com.tencent.mars.xlog.Log.i(this.f445241b, sb6.toString());
        holder.f21927e.setTextSize(this.f445247h);
    }

    public dk2.zf e(r45.ch1 msg) {
        kotlin.jvm.internal.o.g(msg, "msg");
        return null;
    }

    public dk2.zf f(r45.t12 msg) {
        kotlin.jvm.internal.o.g(msg, "msg");
        return null;
    }

    public final java.lang.String g() {
        java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.d5u);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        return string;
    }

    public final gm2.i1 h() {
        int i17 = gm2.i1.f273411f;
        gm2.e1 e1Var = new gm2.e1();
        e1Var.f273358a.f273382m = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_3);
        e1Var.f273358a.f273372c = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.f478553an);
        e1Var.f((int) com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimension(com.tencent.mm.R.dimen.f479591a1));
        e1Var.c((int) com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimension(com.tencent.mm.R.dimen.f479648bn));
        e1Var.e(i());
        return e1Var.a();
    }

    public final java.lang.String i() {
        java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.d5o);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        return string;
    }

    public final al5.w j() {
        return (al5.w) ((jz5.n) this.f445246g).getValue();
    }

    public final gm2.i1 k(int i17) {
        int i18 = gm2.i1.f273411f;
        gm2.e1 e1Var = new gm2.e1();
        e1Var.f273358a.f273372c = android.graphics.Color.parseColor("#B4ECCE");
        e1Var.f((int) com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimension(com.tencent.mm.R.dimen.f479788f9));
        e1Var.c((int) com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimension(com.tencent.mm.R.dimen.f479644bj));
        java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.oub);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        e1Var.e(string);
        gm2.h1 h1Var = e1Var.f273358a;
        h1Var.f273378i = 0;
        h1Var.f273387r = i17;
        return e1Var.a();
    }

    public final boolean l() {
        mm2.c1 c1Var = (mm2.c1) dk2.ef.f233372a.i(mm2.c1.class);
        if (c1Var != null) {
            return c1Var.D3;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0020, code lost:
    
        if ((r7 == null || r7.length() == 0) == false) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(bm2.h1 r5, com.tencent.mm.protocal.protobuf.FinderContact r6, boolean r7) {
        /*
            r4 = this;
            java.lang.String r0 = "holder"
            kotlin.jvm.internal.o.g(r5, r0)
            zl2.a r0 = zl2.a.f473632a
            r1 = 0
            r2 = 0
            android.widget.ImageView r5 = r5.f21935p
            if (r6 == 0) goto L30
            if (r7 != 0) goto L23
            java.lang.String r7 = r6.getHeadUrl()
            r3 = 1
            if (r7 == 0) goto L1f
            int r7 = r7.length()
            if (r7 != 0) goto L1d
            goto L1f
        L1d:
            r7 = r1
            goto L20
        L1f:
            r7 = r3
        L20:
            if (r7 != 0) goto L23
            goto L24
        L23:
            r3 = r1
        L24:
            if (r3 == 0) goto L27
            goto L28
        L27:
            r6 = r2
        L28:
            if (r6 == 0) goto L30
            r0.a(r5, r6)
            jz5.f0 r6 = jz5.f0.f302826a
            goto L31
        L30:
            r6 = r2
        L31:
            if (r6 != 0) goto L36
            r0.a(r5, r2)
        L36:
            r5.setVisibility(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: we2.o.m(bm2.h1, com.tencent.mm.protocal.protobuf.FinderContact, boolean):void");
    }

    public abstract int n();

    public void o() {
    }

    public void p(android.content.Context context, bm2.h1 holder, dk2.zf msg, int i17, java.util.List payloads) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(msg, "msg");
        kotlin.jvm.internal.o.g(payloads, "payloads");
    }
}
