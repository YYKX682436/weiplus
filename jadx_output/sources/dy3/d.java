package dy3;

/* loaded from: classes.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dy3.n f244576d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(dy3.n nVar) {
        super(0);
        this.f244576d = nVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return new xm3.t0(this.f244576d.K(), new in5.s() { // from class: com.tencent.mm.plugin.ringtone.widget.at.RingtoneAtSomeoneDialog$buildItemConvertFactory$1
            @Override // in5.s
            public in5.r getItemConvert(int type) {
                return type == 1 ? new dy3.s() : new dy3.o();
            }
        }, false, 4, null);
    }
}
