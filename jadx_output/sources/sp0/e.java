package sp0;

/* loaded from: classes7.dex */
public final class e extends tp0.c {
    @Override // lc3.c0
    public java.lang.String f() {
        return "insertFrameSet";
    }

    @Override // tp0.c
    public void z(org.json.JSONObject data, jc3.m coverViewDelegate, yz5.l callback) {
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(coverViewDelegate, "coverViewDelegate");
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mm.flutter.plugin.proto.l builder = com.tencent.mm.flutter.plugin.proto.m.f68004o.toBuilder();
        int v17 = v(data);
        builder.f67996d |= 1;
        builder.f67997e = v17;
        builder.onChanged();
        java.lang.String optString = data.optString("frameSetName");
        optString.getClass();
        builder.f67996d |= 2;
        builder.f67998f = optString;
        builder.onChanged();
        java.lang.String optString2 = data.optString("frameSetRootId");
        optString2.getClass();
        builder.f67996d |= 32;
        builder.f68003n = optString2;
        builder.onChanged();
        java.lang.String optString3 = data.optString("containerTag");
        kotlin.jvm.internal.o.f(optString3, "optString(...)");
        builder.f67996d |= 4;
        builder.f67999g = optString3;
        builder.onChanged();
        boolean z17 = data.optInt("hide") > 1;
        builder.f67996d |= 16;
        builder.f68002m = z17;
        builder.onChanged();
        callback.invoke(new sp0.d(builder, null));
    }
}
