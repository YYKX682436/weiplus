package mz;

@j95.b
/* loaded from: classes6.dex */
public final class c extends i95.w implements nz.e {
    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        super.onAccountInitialized(context);
        com.tencent.mars.cdn.CronetLogic.setSimpleDnsCallback(mz.b.f332863a);
    }
}
