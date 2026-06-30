package sj4;

/* loaded from: classes8.dex */
public final class k0 extends bi4.o0 {

    /* renamed from: c, reason: collision with root package name */
    public pj4.d0 f408860c;

    @Override // bi4.o0
    public boolean d(android.content.Context context, android.os.Bundle bundle) {
        pj4.d0 d0Var = this.f408860c;
        if (d0Var != null) {
            pj4.j0 j0Var = this.f21074b;
            if (kotlin.jvm.internal.o.b(j0Var != null ? j0Var.f355139d : null, "16")) {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("feed_encrypted_object_id", d0Var.f355015d);
                intent.putExtra("feed_object_nonceId", d0Var.f355016e);
                intent.putExtra("key_need_related_list", false);
                ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Bj(20, 2, 25, intent);
                ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                ya2.e1 e1Var = ya2.e1.f460472a;
                kotlin.jvm.internal.o.d(context);
                zy2.ta.b(e1Var, context, intent, false, 4, null);
            }
        }
        return false;
    }

    @Override // bi4.o0
    public boolean j() {
        return false;
    }

    @Override // bi4.o0
    public void m(java.lang.String str, pj4.j0 j0Var) {
        super.m(str, j0Var);
        if (j0Var == null || !kotlin.jvm.internal.o.b(j0Var.f355139d, "16")) {
            return;
        }
        byte[] decode = android.util.Base64.decode(j0Var.f355142g, 0);
        pj4.d0 d0Var = new pj4.d0();
        d0Var.parseFrom(decode);
        this.f408860c = d0Var;
    }

    @Override // bi4.o0
    public void n() {
    }

    @Override // bi4.o0
    public boolean p(android.widget.FrameLayout container) {
        kotlin.jvm.internal.o.g(container, "container");
        android.widget.ImageView imageView = (android.widget.ImageView) container.findViewWithTag("MicroMsg.Finder3rdVideoStatusService");
        if (imageView == null) {
            imageView = new android.widget.ImageView(container.getContext());
        }
        android.widget.ImageView imageView2 = imageView;
        imageView2.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
        container.removeAllViews();
        container.addView(imageView2);
        pj4.d0 d0Var = this.f408860c;
        java.lang.String str = d0Var != null ? d0Var.f355018g : null;
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
        ya2.l lVar = ya2.l.f460502a;
        if (str == null) {
            str = "";
        }
        zy2.v8.c(lVar, imageView2, str, null, 4, null);
        return true;
    }
}
