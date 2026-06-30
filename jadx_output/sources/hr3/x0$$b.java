package hr3;

/* loaded from: classes8.dex */
public final /* synthetic */ class x0$$b implements java.util.function.BiFunction {
    @Override // java.util.function.BiFunction
    public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Integer num = (java.lang.Integer) obj2;
        java.util.Map map = com.tencent.mm.plugin.profile.ui.ContactInfoUI.U;
        return java.lang.Integer.valueOf((num == null ? 0 : num.intValue()) + 1);
    }
}
