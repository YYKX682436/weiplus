package oy5;

/* loaded from: classes10.dex */
public final class i implements com.tme.karaoke.lib_singscore.IGroveAndHitCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ oy5.h f350136a;

    public i(oy5.h hVar) {
        this.f350136a = hVar;
    }

    @Override // com.tme.karaoke.lib_singscore.IGroveAndHitCallback
    public void hitGrove(int i17, boolean z17, float f17) {
        com.tme.karaoke.lib_singscore.IGroveAndHitCallback iGroveAndHitCallback = this.f350136a.f350121j;
        if (iGroveAndHitCallback != null) {
            iGroveAndHitCallback.hitGrove(i17, z17, f17);
        }
    }
}
