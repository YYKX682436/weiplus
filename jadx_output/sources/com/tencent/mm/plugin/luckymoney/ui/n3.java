package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes3.dex */
public class n3 implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.o3 f147217d;

    public n3(com.tencent.mm.plugin.luckymoney.ui.o3 o3Var) {
        this.f147217d = o3Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.View view = (android.view.View) obj;
        com.tencent.mm.plugin.luckymoney.ui.o3 o3Var = this.f147217d;
        return !o3Var.f147256e ? o3Var.getString(com.tencent.mm.R.string.gjx) : ((java.lang.Boolean) view.getTag(com.tencent.mm.R.id.ozk)).booleanValue() ? o3Var.getString(com.tencent.mm.R.string.gjy) : o3Var.getString(com.tencent.mm.R.string.gjz);
    }
}
