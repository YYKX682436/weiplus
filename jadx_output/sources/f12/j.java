package f12;

/* loaded from: classes4.dex */
public final class j implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.eggspring.ui.SpringLuckyEggActivity f258616d;

    public j(com.tencent.mm.plugin.eggspring.ui.SpringLuckyEggActivity springLuckyEggActivity) {
        this.f258616d = springLuckyEggActivity;
    }

    @Override // androidx.lifecycle.k0
    public final void onChanged(java.lang.Object obj) {
        f21.d0 d0Var = (f21.d0) obj;
        if (d0Var == null) {
            return;
        }
        java.lang.String str = y12.j.c() + "/egg/";
        boolean z17 = d0Var.f258870y == 0;
        com.tencent.mm.plugin.eggspring.ui.SpringLuckyEggActivity springLuckyEggActivity = this.f258616d;
        springLuckyEggActivity.getWindow().getDecorView().setSystemUiVisibility(z17 ? 9984 : 1792);
        springLuckyEggActivity.setBackBtnColorFilter(z17 ? com.tencent.mm.R.color.BW_0 : com.tencent.mm.R.color.f478553an);
        f12.c0 c0Var = springLuckyEggActivity.f97440f;
        if (c0Var == null) {
            kotlin.jvm.internal.o.o("viewBinding");
            throw null;
        }
        c0Var.f258580i.setText(d0Var.f258858m);
        f12.c0 c0Var2 = springLuckyEggActivity.f97440f;
        if (c0Var2 == null) {
            kotlin.jvm.internal.o.o("viewBinding");
            throw null;
        }
        c0Var2.f258581j.setImageFilePath(str + '/' + d0Var.f258857i);
        f12.c0 c0Var3 = springLuckyEggActivity.f97440f;
        if (c0Var3 == null) {
            kotlin.jvm.internal.o.o("viewBinding");
            throw null;
        }
        c0Var3.f258575d.setText(d0Var.f258853e);
        f12.c0 c0Var4 = springLuckyEggActivity.f97440f;
        if (c0Var4 == null) {
            kotlin.jvm.internal.o.o("viewBinding");
            throw null;
        }
        c0Var4.f258576e.setText(d0Var.f258855g);
        int V6 = com.tencent.mm.plugin.eggspring.ui.SpringLuckyEggActivity.V6(springLuckyEggActivity, d0Var.f258854f, com.tencent.mm.R.color.a6y);
        int V62 = com.tencent.mm.plugin.eggspring.ui.SpringLuckyEggActivity.V6(springLuckyEggActivity, d0Var.f258856h, com.tencent.mm.R.color.amt);
        f12.c0 c0Var5 = springLuckyEggActivity.f97440f;
        if (c0Var5 == null) {
            kotlin.jvm.internal.o.o("viewBinding");
            throw null;
        }
        c0Var5.f258575d.setTextColor(com.tencent.mm.plugin.eggspring.ui.SpringLuckyEggActivity.T6(springLuckyEggActivity, V6, 1.0f));
        f12.c0 c0Var6 = springLuckyEggActivity.f97440f;
        if (c0Var6 == null) {
            kotlin.jvm.internal.o.o("viewBinding");
            throw null;
        }
        c0Var6.f258574c.r(V6, 1.0f);
        android.content.res.ColorStateList T6 = com.tencent.mm.plugin.eggspring.ui.SpringLuckyEggActivity.T6(springLuckyEggActivity, V62, 0.5f);
        f12.c0 c0Var7 = springLuckyEggActivity.f97440f;
        if (c0Var7 == null) {
            kotlin.jvm.internal.o.o("viewBinding");
            throw null;
        }
        c0Var7.f258576e.setTextColor(T6);
        f12.c0 c0Var8 = springLuckyEggActivity.f97440f;
        if (c0Var8 == null) {
            kotlin.jvm.internal.o.o("viewBinding");
            throw null;
        }
        springLuckyEggActivity.getClass();
        c0Var8.f258577f.setBackgroundColor(android.graphics.Color.argb((int) (255 * 0.5f), android.graphics.Color.red(V62), android.graphics.Color.green(V62), android.graphics.Color.blue(V62)));
        f12.c0 c0Var9 = springLuckyEggActivity.f97440f;
        if (c0Var9 == null) {
            kotlin.jvm.internal.o.o("viewBinding");
            throw null;
        }
        c0Var9.f258578g.setTextColor(T6);
        if (d0Var.f258860o == null) {
            f12.c0 c0Var10 = springLuckyEggActivity.f97440f;
            if (c0Var10 == null) {
                kotlin.jvm.internal.o.o("viewBinding");
                throw null;
            }
            c0Var10.f258579h.setImageBitmap(null);
        } else {
            kotlinx.coroutines.l.d(springLuckyEggActivity.f97438d, null, null, new f12.o(springLuckyEggActivity, str, d0Var, null), 3, null);
        }
        java.lang.String str2 = str + '/' + d0Var.f258865t;
        if (com.tencent.mm.vfs.w6.j(str2)) {
            f12.c0 c0Var11 = springLuckyEggActivity.f97440f;
            if (c0Var11 == null) {
                kotlin.jvm.internal.o.o("viewBinding");
                throw null;
            }
            c0Var11.f258573b.setImageFilePath(str2);
        } else {
            java.lang.String str3 = d30.a.f226124g;
            if (com.tencent.mm.vfs.w6.j(str3)) {
                f12.c0 c0Var12 = springLuckyEggActivity.f97440f;
                if (c0Var12 == null) {
                    kotlin.jvm.internal.o.o("viewBinding");
                    throw null;
                }
                c0Var12.f258573b.setImageFilePath(str3);
            } else {
                f12.c0 c0Var13 = springLuckyEggActivity.f97440f;
                if (c0Var13 == null) {
                    kotlin.jvm.internal.o.o("viewBinding");
                    throw null;
                }
                c0Var13.f258573b.setImageResource(com.tencent.mm.R.drawable.c8e);
            }
        }
        f12.c0 c0Var14 = springLuckyEggActivity.f97440f;
        if (c0Var14 == null) {
            kotlin.jvm.internal.o.o("viewBinding");
            throw null;
        }
        c0Var14.f258586o.setTextColor(com.tencent.mm.plugin.eggspring.ui.SpringLuckyEggActivity.V6(springLuckyEggActivity, d0Var.f258867v, com.tencent.mm.R.color.f478553an));
        f12.c0 c0Var15 = springLuckyEggActivity.f97440f;
        if (c0Var15 != null) {
            c0Var15.f258586o.setBackgroundColor(com.tencent.mm.plugin.eggspring.ui.SpringLuckyEggActivity.V6(springLuckyEggActivity, d0Var.f258866u, com.tencent.mm.R.color.Red_90));
        } else {
            kotlin.jvm.internal.o.o("viewBinding");
            throw null;
        }
    }
}
