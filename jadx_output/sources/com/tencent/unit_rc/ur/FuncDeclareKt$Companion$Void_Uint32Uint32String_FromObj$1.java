package com.tencent.unit_rc.ur;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "languageType", "errorType", "", "msg", "Ljz5/f0;", "invoke", "(IILjava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
/* loaded from: classes16.dex */
public final class FuncDeclareKt$Companion$Void_Uint32Uint32String_FromObj$1 extends kotlin.jvm.internal.q implements yz5.q {
    final /* synthetic */ com.tencent.unit_rc.ur.FuncDeclare $funcDeclare;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FuncDeclareKt$Companion$Void_Uint32Uint32String_FromObj$1(com.tencent.unit_rc.ur.FuncDeclare funcDeclare) {
        super(3);
        this.$funcDeclare = funcDeclare;
    }

    @Override // yz5.q
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        invoke(((java.lang.Number) obj).intValue(), ((java.lang.Number) obj2).intValue(), (java.lang.String) obj3);
        return jz5.f0.f302826a;
    }

    public final void invoke(int i17, int i18, java.lang.String msg) {
        kotlin.jvm.internal.o.g(msg, "msg");
        this.$funcDeclare.Void_Uint32Uint32String(i17, i18, msg);
    }
}
