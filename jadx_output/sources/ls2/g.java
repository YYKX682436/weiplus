package ls2;

/* loaded from: classes2.dex */
public final class g extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public static final ls2.b f321028e = new ls2.b(null);

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.b7a;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        ls2.a item = (ls2.a) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        android.content.Context context = holder.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        int color = ((com.tencent.mm.plugin.finder.profile.uic.ie) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.profile.uic.ie.class)).f123811p ? context.getResources().getColor(com.tencent.mm.R.color.f479122ql) : context.getResources().getColor(com.tencent.mm.R.color.f479121qk);
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.jge);
        xc2.p0 p0Var = item.f321020d;
        textView.setText(p0Var.f453234a.getWording());
        textView.setTextColor(color);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("type:");
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = p0Var.f453234a;
        sb6.append(finderJumpInfo.getBusiness_type());
        sb6.append(", ext_info:");
        sb6.append(finderJumpInfo.getExt_info());
        com.tencent.mars.xlog.Log.i("ProfileMenuConvert", sb6.toString());
        wo0.c a17 = new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f353936a.e(zy2.b6.class).c(mn2.i4.class))).I).getValue()).a(new mn2.q3(f321028e.b(context, finderJumpInfo), com.tencent.mm.plugin.finder.storage.y90.f128355e));
        a17.f447873d = new ls2.d(color);
        android.view.View p17 = holder.p(com.tencent.mm.R.id.jgr);
        kotlin.jvm.internal.o.f(p17, "getView(...)");
        ((wo0.b) a17).c((android.widget.ImageView) p17);
        holder.itemView.setOnClickListener(new ls2.e(holder, item));
        android.view.View itemView = holder.itemView;
        kotlin.jvm.internal.o.f(itemView, "itemView");
        ym5.a1.h(itemView, new ls2.f(holder, item));
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
        android.content.Context context = holder.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        int color = ((com.tencent.mm.plugin.finder.profile.uic.ie) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.profile.uic.ie.class)).f123811p ? context.getResources().getColor(com.tencent.mm.R.color.f479122ql) : context.getResources().getColor(com.tencent.mm.R.color.f479121qk);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) holder.p(com.tencent.mm.R.id.jgr);
        weImageView.setLayerPaint(null);
        weImageView.setIconColor(color);
    }
}
