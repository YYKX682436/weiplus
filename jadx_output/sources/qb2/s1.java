package qb2;

/* loaded from: classes8.dex */
public final class s1 extends i13.g {

    /* renamed from: o, reason: collision with root package name */
    public final boolean f361290o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f361291p;

    /* renamed from: q, reason: collision with root package name */
    public final android.content.Intent f361292q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(java.lang.String id6, java.lang.String title, java.lang.String desc, android.graphics.Bitmap bitmap, int i17, long j17, boolean z17, boolean z18, android.content.Intent intent) {
        super(id6, title, desc, bitmap, i17, j17);
        kotlin.jvm.internal.o.g(id6, "id");
        kotlin.jvm.internal.o.g(title, "title");
        kotlin.jvm.internal.o.g(desc, "desc");
        kotlin.jvm.internal.o.g(intent, "intent");
        this.f361290o = z17;
        this.f361291p = z18;
        this.f361292q = intent;
    }

    @Override // i13.c
    public int a() {
        return com.tencent.mm.sdk.platformtools.x2.a(com.tencent.mm.R.color.f479428yz);
    }

    @Override // i13.c
    public android.graphics.drawable.Drawable b() {
        return m95.a.e(com.tencent.mm.sdk.platformtools.x2.f193075e, com.tencent.mm.R.raw.icons_outlined_live, 0.0f);
    }

    @Override // i13.c
    public java.lang.String c() {
        java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.dcl);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        return string;
    }

    @Override // i13.c
    public boolean e() {
        return this.f361290o;
    }

    @Override // i13.c
    public boolean f() {
        return this.f361291p;
    }

    @Override // i13.c
    public void j() {
        long longExtra = this.f361292q.getLongExtra("KEY_OBJECT_ID", 0L);
        r45.jn0 jn0Var = new r45.jn0();
        jn0Var.set(0, java.lang.Long.valueOf(longExtra));
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("feedActionType", 38);
        jSONObject.put("feedActionSubType", 1);
        jn0Var.set(3, jSONObject.toString());
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).al(null, 18054, jn0Var);
    }

    @Override // i13.c
    public void n(in5.s0 holder, android.view.View view, int i17) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(view, "view");
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).bl("temp_34");
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(this.f361292q);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/finder/conv/FinderLiveMsgItem", "onItemClick", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Landroid/view/View;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/finder/conv/FinderLiveMsgItem", "onItemClick", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Landroid/view/View;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    @Override // i13.g
    public void r(in5.s0 holder, int i17, int i18, boolean z17, java.util.List list) {
        jz5.f0 f0Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        boolean z18 = ((k13.l1) ((h50.k) ((i50.s) i95.n0.c(i50.s.class))).wi()).f303213g;
        android.content.Context context = holder.f293121e;
        if (z18) {
            android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.odf);
            if (textView != null) {
                textView.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.f479147rb));
            }
            android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.po8);
            if (textView2 != null) {
                textView2.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.r_));
            }
        } else {
            android.widget.TextView textView3 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.odf);
            if (textView3 != null) {
                textView3.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.f479146r9));
            }
            android.widget.TextView textView4 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.po8);
            if (textView4 != null) {
                textView4.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.f479144r7));
            }
        }
        android.widget.ImageView imageView = (android.widget.ImageView) holder.itemView.findViewById(com.tencent.mm.R.id.a_4);
        android.widget.ImageView imageView2 = (android.widget.ImageView) holder.itemView.findViewById(com.tencent.mm.R.id.a86);
        android.widget.TextView textView5 = (android.widget.TextView) holder.itemView.findViewById(com.tencent.mm.R.id.odf);
        android.widget.TextView textView6 = (android.widget.TextView) holder.itemView.findViewById(com.tencent.mm.R.id.po8);
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context2 = textView5.getContext();
        float textSize = textView5.getTextSize();
        ((ke0.e) xVar).getClass();
        textView5.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(context2, this.f287281h, textSize));
        textView6.setText(this.f287282i);
        textView6.requestLayout();
        android.graphics.Bitmap bitmap = this.f287283m;
        if (bitmap != null) {
            imageView.setVisibility(0);
            imageView.setImageBitmap(bitmap);
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            imageView.setVisibility(8);
        }
        int i19 = this.f287284n;
        if (i19 != 1 && i19 != 2) {
            imageView2.setVisibility(8);
            return;
        }
        com.tencent.mm.protocal.protobuf.FinderAuthInfo finderAuthInfo = new com.tencent.mm.protocal.protobuf.FinderAuthInfo();
        finderAuthInfo.setAuthIconType(i19);
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        ya2.m1 m1Var = ya2.m1.f460511a;
        kotlin.jvm.internal.o.d(imageView2);
        zy2.tb.a(m1Var, imageView2, finderAuthInfo, 0, 4, null);
    }
}
