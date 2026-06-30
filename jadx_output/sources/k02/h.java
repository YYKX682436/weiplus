package k02;

/* loaded from: classes8.dex */
public class h implements com.tencent.mm.ui.widget.dialog.c1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int[] f303080d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k02.k f303081e;

    public h(int[] iArr, k02.k kVar) {
        this.f303080d = iArr;
        this.f303081e = kVar;
    }

    @Override // com.tencent.mm.ui.widget.dialog.c1
    public void onDismiss() {
        k02.k kVar;
        if (this.f303080d[0] == 1 || (kVar = this.f303081e) == null) {
            return;
        }
        kVar.a();
    }
}
