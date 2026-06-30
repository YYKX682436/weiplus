package x84;

/* loaded from: classes3.dex */
public final class a {
    public a(kotlin.jvm.internal.i iVar) {
    }

    public final java.lang.String a(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("generateKey", "com.tencent.mm.plugin.sns.ad.widget.nickname.AdHandleImageSpanLogic$Companion");
        java.lang.String str2 = str + "_" + gm0.j1.b().j();
        kotlin.jvm.internal.o.f(str2, "toString(...)");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("generateKey", "com.tencent.mm.plugin.sns.ad.widget.nickname.AdHandleImageSpanLogic$Companion");
        return str2;
    }
}
