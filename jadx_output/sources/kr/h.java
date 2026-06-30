package kr;

/* loaded from: classes3.dex */
public final class h implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kr.i f311296d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f311297e;

    public h(kr.i iVar, android.view.View view) {
        this.f311296d = iVar;
        this.f311297e = view;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public final boolean onTimerExpired() {
        this.f311296d.f311299e = true;
        return this.f311297e.performClick();
    }
}
