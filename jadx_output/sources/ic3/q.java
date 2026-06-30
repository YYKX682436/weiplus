package ic3;

/* loaded from: classes12.dex */
public final class q implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.magicbrush.ad.MagicAdServiceDemoActivity f290417d;

    public q(com.tencent.mm.plugin.magicbrush.ad.MagicAdServiceDemoActivity magicAdServiceDemoActivity) {
        this.f290417d = magicAdServiceDemoActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/magicbrush/ad/MagicAdServiceDemoActivity$buttonDataList$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.magicbrush.ad.MagicAdServiceDemoActivity magicAdServiceDemoActivity = this.f290417d;
        java.lang.String str = magicAdServiceDemoActivity.f147850d;
        com.tencent.mm.plugin.magicbrush.ad.MagicAdServiceDemoActivity.U6(magicAdServiceDemoActivity, "force pull ads");
        xj.i iVar = (xj.i) i95.n0.c(xj.i.class);
        for (int i17 = 1; i17 < 11; i17++) {
            wj.t0 posId = magicAdServiceDemoActivity.f147851e;
            java.lang.String aid = java.lang.String.valueOf(i17);
            ((wj.j0) iVar).getClass();
            kotlin.jvm.internal.o.g(posId, "posId");
            kotlin.jvm.internal.o.g(aid, "aid");
            posId.toString();
            gk.b.f272408a.e(posId.f446518d, ik.f.f291821a.e(posId, aid));
        }
        wj.t0 t0Var = magicAdServiceDemoActivity.f147851e;
        if (!t0Var.f446520f) {
            java.lang.String valueOf = java.lang.String.valueOf(magicAdServiceDemoActivity.f147855i.g(100000L));
            r45.e5 e5Var = new r45.e5();
            e5Var.set(6, com.tencent.mm.protobuf.g.c(valueOf));
            e5Var.set(5, magicAdServiceDemoActivity.f147851e.f446518d);
            e5Var.set(8, com.tencent.mm.protobuf.g.c(valueOf));
            e5Var.set(23, com.tencent.mm.protobuf.g.c("ad desc"));
            e5Var.set(9, com.tencent.mm.protobuf.g.c("https://dldir1v6.qq.com/weixin/checkresupdate/shopicon_51fca260daa5429ca68962e278c6eef5.png"));
            e5Var.set(10, "https://dldir1v6.qq.com/weixin/checkresupdate/shopicon_51fca260daa5429ca68962e278c6eef5.png");
            byte[] byteArray = e5Var.toByteArray();
            kotlin.jvm.internal.o.f(byteArray, "toByteArray(...)");
            ((wj.j0) iVar).qj(t0Var, byteArray, true);
        }
        com.tencent.mm.plugin.magicbrush.ad.MagicAdServiceDemoActivity.U6(magicAdServiceDemoActivity, "don't click this button, if you click it, please click FORCE CLEAN");
        yj0.a.h(this, "com/tencent/mm/plugin/magicbrush/ad/MagicAdServiceDemoActivity$buttonDataList$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
