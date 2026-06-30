package gp4;

/* loaded from: classes10.dex */
public final class m extends android.widget.LinearLayout implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public yz5.a f274417d;

    /* renamed from: e, reason: collision with root package name */
    public yz5.a f274418e;

    /* renamed from: f, reason: collision with root package name */
    public yz5.a f274419f;

    /* renamed from: g, reason: collision with root package name */
    public yz5.a f274420g;

    /* renamed from: h, reason: collision with root package name */
    public yz5.a f274421h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.ViewGroup f274422i;

    /* renamed from: m, reason: collision with root package name */
    public final android.view.ViewGroup f274423m;

    /* renamed from: n, reason: collision with root package name */
    public final android.view.ViewGroup f274424n;

    /* renamed from: o, reason: collision with root package name */
    public final android.view.ViewGroup f274425o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f274426p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f274427q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f274428r;

    public m(android.content.Context context) {
        super(context);
        this.f274426p = true;
        this.f274427q = jz5.h.b(new gp4.l(this));
        this.f274428r = jz5.h.b(new gp4.k(this));
        android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.d0l, (android.view.ViewGroup) this, true);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.hip);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) findViewById;
        this.f274422i = viewGroup;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.him);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.hin);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) findViewById3;
        this.f274423m = viewGroup2;
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.hil);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        android.view.ViewGroup viewGroup3 = (android.view.ViewGroup) findViewById4;
        this.f274424n = viewGroup3;
        android.view.View findViewById5 = findViewById(com.tencent.mm.R.id.hio);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        android.view.ViewGroup viewGroup4 = (android.view.ViewGroup) findViewById5;
        this.f274425o = viewGroup4;
        b(viewGroup, com.tencent.mm.R.raw.icons_filled_time, com.tencent.mm.R.string.k8h);
        b((android.view.ViewGroup) findViewById2, com.tencent.mm.R.raw.icons_filled_delete, com.tencent.mm.R.string.k8e);
        b(viewGroup2, com.tencent.mm.R.raw.icons_filled_pencil, com.tencent.mm.R.string.k8f);
        b(viewGroup3, com.tencent.mm.R.raw.icons_filled_caption, com.tencent.mm.R.string.k8d);
        b(viewGroup4, com.tencent.mm.R.raw.icons_filled_talk, com.tencent.mm.R.string.k8g);
    }

    private final android.graphics.drawable.Drawable getDownDrawable() {
        return (android.graphics.drawable.Drawable) ((jz5.n) this.f274428r).getValue();
    }

    private final android.graphics.drawable.Drawable getUpDrawable() {
        return (android.graphics.drawable.Drawable) ((jz5.n) this.f274427q).getValue();
    }

    public final void a() {
        setBackground(getDownDrawable());
    }

    public final void b(android.view.ViewGroup viewGroup, int i17, int i18) {
        ((android.widget.TextView) viewGroup.findViewById(com.tencent.mm.R.id.obc)).setText(i65.a.r(getContext(), i18));
        ((com.tencent.mm.ui.widget.imageview.WeImageView) viewGroup.findViewById(com.tencent.mm.R.id.h5n)).setImageResource(i17);
        android.widget.ImageView imageView = (android.widget.ImageView) viewGroup.findViewById(com.tencent.mm.R.id.bs7);
        if (imageView != null) {
            imageView.setImageDrawable(i65.a.i(getContext(), com.tencent.mm.R.raw.popvideo_post_selected_origin));
        }
        viewGroup.setOnClickListener(this);
    }

    public final void c() {
        setBackground(getUpDrawable());
    }

    public final yz5.a getDeleteListener() {
        return this.f274418e;
    }

    public final yz5.a getEditCaptionListener() {
        return this.f274420g;
    }

    public final yz5.a getEditContentListener() {
        return this.f274419f;
    }

    public final yz5.a getEditTimeListener() {
        return this.f274417d;
    }

    public final yz5.a getReadTextListener() {
        return this.f274421h;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        yz5.a aVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/vlog/ui/plugin/timeedit/TimeEditMenuView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        if (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.him) {
            yz5.a aVar2 = this.f274418e;
            if (aVar2 != null) {
                aVar2.invoke();
            }
        } else if (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.hip) {
            yz5.a aVar3 = this.f274417d;
            if (aVar3 != null) {
                aVar3.invoke();
            }
        } else if (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.hin) {
            yz5.a aVar4 = this.f274419f;
            if (aVar4 != null) {
                aVar4.invoke();
            }
        } else if (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.hil) {
            yz5.a aVar5 = this.f274420g;
            if (aVar5 != null) {
                aVar5.invoke();
            }
        } else if (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.hio && (aVar = this.f274421h) != null) {
            aVar.invoke();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/vlog/ui/plugin/timeedit/TimeEditMenuView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    public final void setDeleteListener(yz5.a aVar) {
        this.f274418e = aVar;
    }

    public final void setEditCaptionListener(yz5.a aVar) {
        this.f274420g = aVar;
    }

    public final void setEditContentListener(yz5.a aVar) {
        this.f274419f = aVar;
    }

    public final void setEditTimeListener(yz5.a aVar) {
        this.f274417d = aVar;
    }

    public final void setReadTextListener(yz5.a aVar) {
        this.f274421h = aVar;
    }
}
