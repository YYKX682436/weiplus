package yx2;

/* loaded from: classes10.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yx2.f f467836d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderObject f467837e;

    public d(yx2.f fVar, com.tencent.mm.protocal.protobuf.FinderObject finderObject) {
        this.f467836d = fVar;
        this.f467837e = finderObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yx2.f fVar = this.f467836d;
        android.widget.TextView textView = fVar.f467844c;
        fVar.getClass();
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc = this.f467837e.getObjectDesc();
        java.lang.String description = objectDesc != null ? objectDesc.getDescription() : null;
        if (description == null) {
            description = "";
        }
        textView.setText(description);
    }
}
