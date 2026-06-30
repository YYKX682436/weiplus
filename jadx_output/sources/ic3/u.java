package ic3;

/* loaded from: classes12.dex */
public final class u extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.magicbrush.ad.MagicAdServiceDemoActivity f290421d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(com.tencent.mm.plugin.magicbrush.ad.MagicAdServiceDemoActivity magicAdServiceDemoActivity) {
        super(1);
        this.f290421d = magicAdServiceDemoActivity;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        xj.m mVar = (xj.m) obj;
        com.tencent.mm.plugin.magicbrush.ad.MagicAdServiceDemoActivity magicAdServiceDemoActivity = this.f290421d;
        if (mVar != null) {
            java.lang.String str = magicAdServiceDemoActivity.f147850d;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getAdInfoAsync success: ");
            java.lang.String str2 = mVar.f454754b;
            sb6.append(str2);
            com.tencent.mm.plugin.magicbrush.ad.MagicAdServiceDemoActivity.U6(magicAdServiceDemoActivity, sb6.toString());
            java.lang.String str3 = mVar.f454753a;
            magicAdServiceDemoActivity.f147852f = str3;
            androidx.appcompat.app.AppCompatActivity context = magicAdServiceDemoActivity.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            magicAdServiceDemoActivity.f147853g = new ic3.f0(context, str2, str3);
            ((android.widget.FrameLayout) magicAdServiceDemoActivity.findViewById(com.tencent.mm.R.id.cg7)).addView(magicAdServiceDemoActivity.f147853g);
        } else {
            com.tencent.mars.xlog.Log.e(magicAdServiceDemoActivity.f147850d, "getAdInfoAsync, adInfo is empty");
            com.tencent.mm.plugin.magicbrush.ad.MagicAdServiceDemoActivity.U6(magicAdServiceDemoActivity, "getAdInfoAsync failed: adInfo is empty");
        }
        return jz5.f0.f302826a;
    }
}
