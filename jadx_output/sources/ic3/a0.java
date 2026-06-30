package ic3;

/* loaded from: classes12.dex */
public final class a0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.EditText f290388d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.magicbrush.ad.MagicAdServiceDemoActivity f290389e;

    public a0(android.widget.EditText editText, com.tencent.mm.plugin.magicbrush.ad.MagicAdServiceDemoActivity magicAdServiceDemoActivity) {
        this.f290388d = editText;
        this.f290389e = magicAdServiceDemoActivity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        java.lang.String str;
        java.lang.Long j17 = r26.h0.j(r26.n0.u0(this.f290388d.getText().toString()).toString());
        com.tencent.mm.plugin.magicbrush.ad.MagicAdServiceDemoActivity magicAdServiceDemoActivity = this.f290389e;
        if (j17 == null || j17.longValue() < 0) {
            com.tencent.mm.plugin.magicbrush.ad.MagicAdServiceDemoActivity.U6(magicAdServiceDemoActivity, "⚠️ 请输入非负整数");
            return;
        }
        long j18 = magicAdServiceDemoActivity.f147856m;
        magicAdServiceDemoActivity.f147856m = j17.longValue();
        magicAdServiceDemoActivity.V6();
        com.tencent.mars.xlog.Log.i(magicAdServiceDemoActivity.f147850d, "changeTimeout " + j18 + " -> " + j17);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("超时已设为 ");
        if (j17.longValue() == 0) {
            str = "无超时";
        } else {
            str = j17 + "ms";
        }
        sb6.append(str);
        com.tencent.mm.plugin.magicbrush.ad.MagicAdServiceDemoActivity.U6(magicAdServiceDemoActivity, sb6.toString());
    }
}
