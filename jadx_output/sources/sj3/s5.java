package sj3;

/* loaded from: classes4.dex */
public final class s5 extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f408741d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f408742e;

    public s5(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f408741d = context;
        this.f408742e = new java.util.ArrayList();
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return (int) java.lang.Math.ceil(this.f408742e.size() / 5);
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        sj3.t5 holder = (sj3.t5) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        int i18 = (i17 + 1) * 5;
        java.util.ArrayList arrayList = this.f408742e;
        if (i18 >= arrayList.size()) {
            i18 = arrayList.size();
        }
        android.content.Context context = this.f408741d;
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(context);
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(14);
        if (i17 != 0) {
            layoutParams.topMargin = sj3.i1.f408559d;
        }
        if (i17 == getItemCount() - 1) {
            int size = arrayList.size() % 5;
            layoutParams.leftMargin = size == 0 ? 0 : ((sj3.i1.f408564i + sj3.i1.f408559d) * (5 - size)) / 2;
        }
        linearLayout.setLayoutParams(layoutParams);
        int i19 = i17 * 5;
        for (int i27 = i19; i27 < i18; i27++) {
            android.widget.ImageView imageView = new android.widget.ImageView(context);
            int i28 = sj3.i1.f408564i;
            android.widget.LinearLayout.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(i28, i28);
            if (i27 != i19) {
                layoutParams2.leftMargin = sj3.i1.f408559d;
            }
            imageView.setLayoutParams(layoutParams2);
            linearLayout.addView(imageView);
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
            java.lang.String str = (java.lang.String) arrayList.get(i27);
            ((sg3.a) v0Var).getClass();
            java.lang.String e17 = c01.a2.e(str);
            ((ke0.e) xVar).getClass();
            imageView.setContentDescription(com.tencent.mm.pluginsdk.ui.span.c0.i(context, e17));
            ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(imageView, (java.lang.String) arrayList.get(i27), null);
        }
        android.widget.RelativeLayout relativeLayout = holder.f408750d;
        if (relativeLayout != null) {
            relativeLayout.addView(linearLayout);
        }
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(this.f408741d).inflate(com.tencent.mm.R.layout.c3y, parent, false);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        return new sj3.t5(inflate);
    }

    public final boolean x(java.lang.String userName) {
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(userName, "userName");
        java.util.Iterator it = this.f408742e.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (kotlin.jvm.internal.o.b((java.lang.String) obj, userName)) {
                break;
            }
        }
        return obj != null;
    }
}
