package vm3;

/* loaded from: classes14.dex */
public final class b implements al5.e0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vm3.d f438142d;

    public b(vm3.d dVar) {
        this.f438142d = dVar;
    }

    @Override // al5.e0
    public final void J2(boolean z17, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.KeyboardInputChangeUIC", "onCreate: addExternalListener isKeyboardShow:" + z17 + " keyboardHeight:" + i17);
        vm3.d dVar = this.f438142d;
        dVar.f438145e = z17;
        if (z17) {
            dVar.T6();
        }
    }
}
