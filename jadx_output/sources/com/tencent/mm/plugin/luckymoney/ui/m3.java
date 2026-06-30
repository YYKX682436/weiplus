package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes3.dex */
public class m3 implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.o3 f147163d;

    public m3(com.tencent.mm.plugin.luckymoney.ui.o3 o3Var) {
        this.f147163d = o3Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.View view = (android.view.View) obj;
        if (!((java.lang.Boolean) view.getTag(com.tencent.mm.R.id.iz_)).booleanValue()) {
            view.setImportantForAccessibility(2);
            return "";
        }
        view.setImportantForAccessibility(1);
        com.tencent.mm.plugin.luckymoney.ui.o3 o3Var = this.f147163d;
        java.lang.String string = o3Var.getString(com.tencent.mm.R.string.jar);
        if (view.getAlpha() != 1.0f) {
            return string;
        }
        return string + o3Var.getString(com.tencent.mm.R.string.gjv);
    }
}
