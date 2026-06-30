package dp3;

/* loaded from: classes9.dex */
public class e extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.order.model.MallTransactionObject f242208d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f242209e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.tencent.mm.plugin.order.model.MallTransactionObject mallTransactionObject, android.content.Context context) {
        super(false);
        this.f242208d = mallTransactionObject;
        this.f242209e = context;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        com.tencent.mm.plugin.order.model.MallTransactionObject mallTransactionObject = this.f242208d;
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(mallTransactionObject.C);
        android.content.Context context = this.f242209e;
        if (!K0) {
            linkedList2.add(0);
            linkedList.add(context.getString(com.tencent.mm.R.string.f493579kt3));
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(mallTransactionObject.D)) {
            linkedList2.add(1);
            linkedList.add(context.getString(com.tencent.mm.R.string.f493580kt4));
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(mallTransactionObject.N)) {
            linkedList2.add(2);
            linkedList.add(context.getString(com.tencent.mm.R.string.kt6));
        }
        if (linkedList2.size() == 1) {
            dp3.g.b(((java.lang.Integer) linkedList2.get(0)).intValue(), context, mallTransactionObject);
        } else {
            db5.e1.d(this.f242209e, null, linkedList, linkedList2, null, true, new dp3.d(this));
        }
    }
}
