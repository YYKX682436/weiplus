package lq0;

/* loaded from: classes7.dex */
public final class d extends tp0.c {
    @Override // lc3.c0
    public java.lang.String f() {
        return "insertFrameSet";
    }

    @Override // tp0.c
    public void z(org.json.JSONObject data, jc3.m coverViewDelegate, yz5.l callback) {
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(coverViewDelegate, "coverViewDelegate");
        kotlin.jvm.internal.o.g(callback, "callback");
        ym5.a1.f(new lq0.c(this, data, callback));
    }
}
