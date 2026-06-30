package lr;

/* loaded from: classes15.dex */
public final class f1 extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final ir.h f320516d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f320517e;

    /* renamed from: f, reason: collision with root package name */
    public lr.c1 f320518f;

    /* renamed from: g, reason: collision with root package name */
    public int f320519g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f320520h;

    public f1(ir.h config) {
        kotlin.jvm.internal.o.g(config, "config");
        this.f320516d = config;
        this.f320517e = new java.util.ArrayList();
        this.f320519g = -1;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f320517e.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public long getItemId(int i17) {
        return i17;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemViewType(int i17) {
        ir.y0 x17 = x(i17);
        kotlin.jvm.internal.o.d(x17);
        return x17.f293919a.f293895a;
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        lr.d1 viewHolder = (lr.d1) k3Var;
        kotlin.jvm.internal.o.g(viewHolder, "viewHolder");
        android.content.Context context = viewHolder.itemView.getContext();
        android.content.res.Resources resources = context.getResources();
        android.util.TypedValue typedValue = new android.util.TypedValue();
        context.getTheme().resolveAttribute(com.tencent.mm.R.attr.f478263f3, typedValue, true);
        int color = resources.getColor(typedValue.resourceId);
        viewHolder.itemView.setSelected(this.f320519g == i17);
        ir.y0 x17 = x(i17);
        android.widget.ImageView imageView = viewHolder.f320507d;
        if (x17 == null) {
            imageView.setVisibility(8);
            imageView.setTag("");
            com.tencent.mars.xlog.Log.i("MicroMsg.emoji.SmileyPanel.SmileyTabAdapter", "emoji group info is null. position:%d", java.lang.Integer.valueOf(i17));
            return;
        }
        imageView.setVisibility(0);
        android.widget.ImageView imageView2 = viewHolder.f320508e;
        imageView2.setVisibility(8);
        int i18 = x17.f293919a.f293895a;
        if (i18 == 2) {
            rr.v.a(imageView, com.tencent.mm.R.raw.emoticonstore_manager_icon, color);
            imageView.setContentDescription(context.getString(com.tencent.mm.R.string.iql));
            return;
        }
        if (i18 == 3) {
            if (w75.a.a() && com.tencent.mm.sdk.platformtools.x2.n()) {
                rr.v.a(imageView, com.tencent.mm.R.raw.icons_outlined_search, color);
            } else {
                rr.v.a(imageView, com.tencent.mm.R.raw.emoticonstore_add_icon, color);
            }
            imageView.setContentDescription(context.getString(com.tencent.mm.R.string.c0t));
            if (z65.c.a()) {
                viewHolder.itemView.setOnLongClickListener(lr.e1.f320512d);
                return;
            } else {
                java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                return;
            }
        }
        ir.y0 x18 = x(i17);
        if (x18 == null) {
            return;
        }
        android.util.SparseArray sparseArray = ir.c0.f293820a;
        ir.r rVar = x18.f293919a;
        java.lang.String groupId = rVar.c();
        kotlin.jvm.internal.o.g(groupId, "groupId");
        if (((ir.a0) ir.c0.f293821b.get(groupId)) == null) {
            if (kotlin.jvm.internal.o.b("smiley", rVar.c())) {
                rr.v.a(imageView, com.tencent.mm.R.raw.emoticonstore_emoji_icon, color);
                imageView.setContentDescription(context.getString(com.tencent.mm.R.string.buq));
                return;
            }
            if (kotlin.jvm.internal.o.b("custom", rVar.c())) {
                rr.v.a(imageView, com.tencent.mm.R.raw.emoticonstore_custom_icon, color);
                imageView.setContentDescription(context.getString(com.tencent.mm.R.string.c0s));
                return;
            }
            if (kotlin.jvm.internal.o.b("17", rVar.c())) {
                imageView.setImageResource(com.tencent.mm.R.drawable.bhv);
                imageView.setContentDescription(context.getString(com.tencent.mm.R.string.f491115c00));
                return;
            }
            if (kotlin.jvm.internal.o.b("capture", rVar.c())) {
                rr.v.a(imageView, com.tencent.mm.R.raw.emoticonstore_capture_icon, color);
                imageView.setContentDescription(context.getString(com.tencent.mm.R.string.c0r));
                if (((g30.h) ((k12.s) i95.n0.c(k12.s.class))).Bi().x()) {
                    int i19 = this.f320516d.f293842a;
                    int i27 = com.tencent.mm.pluginsdk.ui.ChatFooterPanel.f189765e;
                    if (i19 == 1) {
                        imageView2.setVisibility(0);
                        return;
                    }
                    return;
                }
                return;
            }
            if (rVar instanceof ir.t) {
                zq.e.f474971a.a(new zq.a(((ir.t) rVar).f293900b)).c(imageView);
            } else {
                wo0.c a17 = vo0.e.f438468b.a(rVar.d());
                yo0.f fVar = new yo0.f();
                fVar.f464078b = true;
                a17.f447872c = fVar.a();
                ((wo0.b) a17).c(imageView);
            }
            java.lang.String e17 = rVar.e();
            if (com.tencent.mm.sdk.platformtools.t8.K0(e17)) {
                imageView.setContentDescription(context.getString(com.tencent.mm.R.string.bzu));
                return;
            }
            imageView.setContentDescription(context.getString(com.tencent.mm.R.string.f491107by3) + e17);
        }
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.co_, parent, false);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        return new lr.d1(this, inflate);
    }

    public final ir.y0 x(int i17) {
        java.util.ArrayList arrayList = this.f320517e;
        if (arrayList.isEmpty() || arrayList.size() < i17 || i17 < 0) {
            return null;
        }
        return (ir.y0) arrayList.get(i17);
    }

    public final void y(int i17) {
        ir.r rVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.SmileyPanel.SmileyTabAdapter", "setSelection: %s", java.lang.Integer.valueOf(i17));
        int i18 = this.f320519g;
        if (i18 != i17) {
            notifyItemChanged(i18);
            this.f320519g = i17;
            ir.y0 x17 = x(i17);
            this.f320520h = (x17 == null || (rVar = x17.f293919a) == null) ? null : rVar.c();
            notifyItemChanged(this.f320519g);
        }
    }
}
