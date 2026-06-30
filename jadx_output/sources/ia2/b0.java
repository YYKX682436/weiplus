package ia2;

/* loaded from: classes2.dex */
public final class b0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f289904d;

    /* renamed from: e, reason: collision with root package name */
    public int f289905e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.activity.poi.flutter.FinderFlutterPOIActivity f289906f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f289907g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(com.tencent.mm.plugin.finder.activity.poi.flutter.FinderFlutterPOIActivity finderFlutterPOIActivity, java.util.Map map, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f289906f = finderFlutterPOIActivity;
        this.f289907g = map;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ia2.b0(this.f289906f, this.f289907g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ia2.b0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x015d  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r29) {
        /*
            Method dump skipped, instructions count: 626
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ia2.b0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
