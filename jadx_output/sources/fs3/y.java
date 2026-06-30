package fs3;

/* loaded from: classes15.dex */
public class y extends android.widget.BaseAdapter {

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f266331e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.animation.Animation f266332f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.animation.Animation f266333g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.animation.Animation f266334h;

    /* renamed from: d, reason: collision with root package name */
    public java.util.LinkedList f266330d = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.HashMap f266335i = new java.util.HashMap();

    public y(android.content.Context context) {
        this.f266331e = context;
        android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(context, com.tencent.mm.R.anim.f477723k);
        this.f266332f = loadAnimation;
        android.view.animation.Animation loadAnimation2 = android.view.animation.AnimationUtils.loadAnimation(context, com.tencent.mm.R.anim.f477723k);
        this.f266334h = loadAnimation2;
        android.view.animation.Animation loadAnimation3 = android.view.animation.AnimationUtils.loadAnimation(context, com.tencent.mm.R.anim.f477724l);
        this.f266333g = loadAnimation3;
        loadAnimation.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
        loadAnimation2.setInterpolator(new android.view.animation.AccelerateInterpolator());
        loadAnimation3.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
        loadAnimation.setDuration(300L);
        loadAnimation2.setDuration(1000L);
        loadAnimation3.setDuration(1000L);
    }

    public void a(java.util.LinkedList linkedList) {
        this.f266330d = linkedList;
        if (linkedList != null && linkedList.size() > 0) {
            int size = this.f266330d.size();
            for (int i17 = 0; i17 < size; i17++) {
                r45.yo0 yo0Var = (r45.yo0) this.f266330d.get(i17);
                java.lang.String str = yo0Var == null ? "" : com.tencent.mm.sdk.platformtools.t8.K0(yo0Var.f391251d) ? yo0Var.f391252e : yo0Var.f391251d;
                java.util.HashMap hashMap = this.f266335i;
                if (!hashMap.containsKey(str)) {
                    hashMap.put(str, java.lang.Boolean.FALSE);
                }
            }
        }
        notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        java.util.LinkedList linkedList = this.f266330d;
        if (linkedList == null) {
            return 1;
        }
        return 1 + linkedList.size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        java.util.LinkedList linkedList = this.f266330d;
        if (linkedList != null && i17 < linkedList.size()) {
            return this.f266330d.get(i17);
        }
        return null;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        fs3.x xVar;
        if (view == null || view.getTag() == null) {
            view = android.view.LayoutInflater.from(this.f266331e).inflate(com.tencent.mm.R.layout.aar, (android.view.ViewGroup) null);
            xVar = new fs3.x(this, view);
            view.setTag(xVar);
        } else {
            xVar = (fs3.x) view.getTag();
        }
        r45.yo0 yo0Var = (r45.yo0) getItem(i17);
        if (yo0Var != null) {
            if (com.tencent.mm.sdk.platformtools.t8.K0(yo0Var.f391253f)) {
                xVar.f266329b.setText(yo0Var.f391251d);
            } else {
                xVar.f266329b.setText(yo0Var.f391253f);
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(yo0Var.f391251d)) {
                android.widget.ImageView imageView = xVar.f266328a;
                java.lang.String str = yo0Var.f391252e;
                com.tencent.mm.pluginsdk.ui.j1 j1Var = ds3.f.f242918a;
                android.graphics.drawable.Drawable drawable = imageView.getDrawable();
                ds3.g gVar = (drawable == null || !(drawable instanceof ds3.g)) ? new ds3.g(str, null) : (ds3.g) drawable;
                gVar.b(str);
                imageView.setImageDrawable(gVar);
            } else {
                android.widget.ImageView imageView2 = xVar.f266328a;
                java.lang.String str2 = yo0Var.f391251d;
                com.tencent.mm.pluginsdk.ui.j1 j1Var2 = ds3.f.f242918a;
                android.graphics.drawable.Drawable drawable2 = imageView2.getDrawable();
                ds3.g gVar2 = (drawable2 == null || !(drawable2 instanceof ds3.g)) ? new ds3.g(str2, null) : (ds3.g) drawable2;
                gVar2.b(str2);
                imageView2.setImageDrawable(gVar2);
            }
            java.lang.String str3 = com.tencent.mm.sdk.platformtools.t8.K0(yo0Var.f391251d) ? yo0Var.f391252e : yo0Var.f391251d;
            view.clearAnimation();
            java.util.HashMap hashMap = this.f266335i;
            if (hashMap.containsKey(str3) && !((java.lang.Boolean) hashMap.get(str3)).booleanValue()) {
                view.startAnimation(this.f266332f);
                hashMap.put(str3, java.lang.Boolean.TRUE);
            }
        }
        if (i17 + 1 == getCount()) {
            xVar.f266329b.setText("");
            xVar.f266328a.setImageResource(com.tencent.mm.R.drawable.f480723bu3);
            fs3.v vVar = new fs3.v(this, view);
            android.view.animation.Animation animation = this.f266334h;
            animation.setAnimationListener(vVar);
            this.f266333g.setAnimationListener(new fs3.w(this, view));
            view.startAnimation(animation);
        }
        return view;
    }
}
