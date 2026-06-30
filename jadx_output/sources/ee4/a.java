package ee4;

/* loaded from: classes4.dex */
public final class a implements com.tencent.mm.ui.tools.h1 {

    /* renamed from: a, reason: collision with root package name */
    public static final ee4.a f251657a = new ee4.a();

    @Override // com.tencent.mm.ui.tools.h1
    public final java.lang.String a(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("genOutputPath", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicActivityResultPc$dealActivityResult$1");
        byte[] bytes = (str + java.lang.System.currentTimeMillis()).getBytes(r26.c.f368865a);
        kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
        java.lang.String str2 = com.tencent.mm.plugin.sns.model.l4.Ni() + kk.k.g(bytes);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("genOutputPath", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicActivityResultPc$dealActivityResult$1");
        return str2;
    }
}
