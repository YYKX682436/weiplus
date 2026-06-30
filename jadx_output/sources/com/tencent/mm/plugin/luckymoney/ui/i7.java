package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes2.dex */
public final class i7 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.j7 f147019d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i7(com.tencent.mm.plugin.luckymoney.ui.j7 j7Var) {
        super(1);
        this.f147019d = j7Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.View view = (android.view.View) obj;
        kotlin.jvm.internal.o.g(view, "view");
        com.tencent.mm.plugin.luckymoney.ui.j7 j7Var = this.f147019d;
        if (!j7Var.f147049e) {
            return j7Var.getString(com.tencent.mm.R.string.gjx);
        }
        java.lang.Object tag = view.getTag(com.tencent.mm.R.id.ozk);
        java.lang.Boolean bool = tag instanceof java.lang.Boolean ? (java.lang.Boolean) tag : null;
        return bool != null ? bool.booleanValue() : false ? j7Var.getString(com.tencent.mm.R.string.gjy) : j7Var.getString(com.tencent.mm.R.string.gjz);
    }
}
