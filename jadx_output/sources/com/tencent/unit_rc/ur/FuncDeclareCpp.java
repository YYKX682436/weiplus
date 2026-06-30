package com.tencent.unit_rc.ur;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\b\u0016\u0018\u0000 \u00142\u00020\u00012\u00020\u0002:\u0001\u0014B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0018\u0010\u0007\u001a\u00020\u00032\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005H\u0016J\u001d\u0010\u000b\u001a\u00020\u00032\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\tH\u0016¨\u0006\u0015"}, d2 = {"Lcom/tencent/unit_rc/ur/FuncDeclareCpp;", "Lcom/tencent/unit_rc/BaseProxyObject;", "Lcom/tencent/unit_rc/ur/FuncDeclare;", "Ljz5/f0;", "Void_Empty", "Lkotlin/Function0;", "runnable", "Void_Func_Void_Empty", "", "", "reportList", "Void_ListString", "([Ljava/lang/String;)V", "", "languageType", "errorType", "msg", "Void_Uint32Uint32String", "<init>", "()V", "Companion", "unit_rc_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes16.dex */
public class FuncDeclareCpp extends com.tencent.unit_rc.BaseProxyObject implements com.tencent.unit_rc.ur.FuncDeclare {
    @Override // com.tencent.unit_rc.ur.FuncDeclare
    public void Void_Empty() {
        urgen.ur_96F1.UR_5A77.UR_3AE4(getCppPointer());
    }

    @Override // com.tencent.unit_rc.ur.FuncDeclare
    public void Void_Func_Void_Empty(yz5.a aVar) {
        urgen.ur_96F1.UR_5A77.UR_76C0(getCppPointer(), com.tencent.unit_rc.ur.FuncDeclareKt.INSTANCE.Void_Empty_ToObj(aVar));
    }

    @Override // com.tencent.unit_rc.ur.FuncDeclare
    public void Void_ListString(java.lang.String[] reportList) {
        kotlin.jvm.internal.o.g(reportList, "reportList");
        urgen.ur_96F1.UR_5A77.UR_427B(getCppPointer(), reportList);
    }

    @Override // com.tencent.unit_rc.ur.FuncDeclare
    public void Void_Uint32Uint32String(int i17, int i18, java.lang.String msg) {
        kotlin.jvm.internal.o.g(msg, "msg");
        urgen.ur_96F1.UR_5A77.UR_5026(getCppPointer(), i17, i18, msg);
    }
}
