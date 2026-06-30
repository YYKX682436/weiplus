package yf2;

/* loaded from: classes10.dex */
public final class v0 implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yf2.z0 f461800d;

    public v0(yf2.z0 z0Var) {
        this.f461800d = z0Var;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        android.content.Intent intent;
        ya2.p1 p1Var;
        android.content.Intent intent2;
        android.content.Intent intent3;
        android.content.Intent intent4;
        android.content.Intent intent5;
        r45.ze2 ze2Var = (r45.ze2) obj;
        yf2.z0 z0Var = this.f461800d;
        ya2.p1 p1Var2 = z0Var.f461824m;
        if (p1Var2 == null) {
            com.tencent.mm.ui.MMActivity N6 = z0Var.N6();
            if (N6 != null && (intent5 = N6.getIntent()) != null) {
                intent5.putExtra("saveLocation", false);
            }
            com.tencent.mm.ui.MMActivity N62 = z0Var.N6();
            if (N62 != null && (intent4 = N62.getIntent()) != null) {
                intent4.putExtra("show_city", false);
            }
            com.tencent.mm.ui.MMActivity N63 = z0Var.N6();
            if (N63 != null && (intent3 = N63.getIntent()) != null) {
                intent3.putExtra("poi_show_none", true);
            }
            com.tencent.mm.ui.MMActivity N64 = z0Var.N6();
            if (N64 != null && (intent2 = N64.getIntent()) != null) {
                intent2.putExtra("can_show_create_poi_tips", false);
            }
            com.tencent.mm.ui.MMActivity N65 = z0Var.N6();
            android.view.View S6 = z0Var.S6(com.tencent.mm.R.id.l0q);
            if (N65 != null && S6 != null) {
                ya2.p1 p1Var3 = (ya2.p1) pf5.u.f353936a.a(ya2.p1.class);
                yv2.b bVar = (yv2.b) p1Var3;
                bVar.f466198d = N65;
                bVar.f466199e = (com.tencent.mm.plugin.finder.live.view.FinderLiveLocationView) S6;
                bVar.f466200f = com.tencent.thumbplayer.tmediacodec.codec.CodecError.START_ILLEGAL;
                bVar.f466201g = 0;
                z0Var.f461824m = p1Var3;
            }
            ya2.p1 p1Var4 = z0Var.f461824m;
            if (p1Var4 != null) {
                ((yv2.b) p1Var4).a().setIconColor(z0Var.O6().getResources().getColor(com.tencent.mm.R.color.f478553an));
            }
            ya2.p1 p1Var5 = z0Var.f461824m;
            if (p1Var5 != null) {
                ((yv2.b) p1Var5).a().setTextColor(z0Var.O6().getResources().getColor(com.tencent.mm.R.color.f478553an));
            }
            ya2.p1 p1Var6 = z0Var.f461824m;
            if (p1Var6 != null) {
                ((yv2.b) p1Var6).a().setDefaultStateIconColor(z0Var.O6().getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_8));
            }
            ya2.p1 p1Var7 = z0Var.f461824m;
            if (p1Var7 != null) {
                ((yv2.b) p1Var7).a().setDefaultStateTextColor(z0Var.O6().getResources().getColor(com.tencent.mm.R.color.f478553an));
            }
            ya2.p1 p1Var8 = z0Var.f461824m;
            if (p1Var8 != null) {
                ((yv2.b) p1Var8).a().setDefaultLoadingPBarColor(z0Var.O6().getResources().getColor(com.tencent.mm.R.color.f478553an));
            }
            ya2.p1 p1Var9 = z0Var.f461824m;
            if (p1Var9 != null) {
                ((yv2.b) p1Var9).a().setDefaultLoadingTipColor(z0Var.O6().getResources().getColor(com.tencent.mm.R.color.f478553an));
            }
            com.tencent.mm.ui.MMActivity N66 = z0Var.N6();
            if (N66 != null && (intent = N66.getIntent()) != null && (p1Var = z0Var.f461824m) != null) {
                ((yv2.b) p1Var).c(intent, new android.os.Bundle());
            }
            ya2.p1 p1Var10 = z0Var.f461824m;
            if (p1Var10 != null) {
                ((yv2.b) p1Var10).a().b(com.tencent.mm.R.raw.finder_live_icon_location_loading);
            }
            pm0.v.K(null, new yf2.u0(ze2Var, z0Var));
        } else {
            yv2.b bVar2 = (yv2.b) p1Var2;
            bVar2.f466202h = ze2Var;
            bVar2.d(true);
        }
        return jz5.f0.f302826a;
    }
}
