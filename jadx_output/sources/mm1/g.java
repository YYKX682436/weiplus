package mm1;

/* loaded from: classes14.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final jz5.g f328661a = jz5.h.b(mm1.e.f328655d);

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f328662b = jz5.h.b(mm1.f.f328659d);

    public static final boolean a(android.media.AudioManager audioManager) {
        kotlin.jvm.internal.o.g(audioManager, "<this>");
        if (!((java.lang.Boolean) ((jz5.n) f328662b).getValue()).booleanValue()) {
            if (android.os.Build.VERSION.SDK_INT < 31) {
                return audioManager.isBluetoothScoOn();
            }
            android.media.AudioDeviceInfo audioDeviceInfo = mm1.d.f328647a;
            android.media.AudioDeviceInfo audioDeviceInfo2 = mm1.d.f328647a;
            return audioDeviceInfo2 != null && audioDeviceInfo2.getType() == 7;
        }
        pm1.o oVar = pm1.e.f356814e.a().f356816a;
        java.lang.Boolean bool = oVar.f356831c;
        if (bool != null) {
            bool.booleanValue();
            ((ku5.t0) ku5.t0.f312615d).h(new pm1.h(oVar), oVar.f356829a);
            return bool.booleanValue();
        }
        android.media.AudioManager audioManager2 = oVar.f356835g;
        kotlin.jvm.internal.o.g(audioManager2, "audioManager");
        boolean isBluetoothScoOn = audioManager2.isBluetoothScoOn();
        oVar.f356831c = java.lang.Boolean.valueOf(isBluetoothScoOn);
        return isBluetoothScoOn;
    }

    public static final boolean b(android.media.AudioManager audioManager) {
        kotlin.jvm.internal.o.g(audioManager, "<this>");
        if (!((java.lang.Boolean) ((jz5.n) f328662b).getValue()).booleanValue()) {
            if (android.os.Build.VERSION.SDK_INT < 31) {
                return audioManager.isSpeakerphoneOn();
            }
            android.media.AudioDeviceInfo audioDeviceInfo = mm1.d.f328647a;
            android.media.AudioDeviceInfo audioDeviceInfo2 = mm1.d.f328647a;
            return audioDeviceInfo2 != null && audioDeviceInfo2.getType() == 2;
        }
        pm1.o oVar = pm1.e.f356814e.a().f356816a;
        java.lang.Boolean bool = oVar.f356830b;
        if (bool != null) {
            bool.booleanValue();
            ((ku5.t0) ku5.t0.f312615d).h(new pm1.j(oVar), oVar.f356829a);
            return bool.booleanValue();
        }
        android.media.AudioManager audioManager2 = oVar.f356835g;
        kotlin.jvm.internal.o.g(audioManager2, "audioManager");
        boolean isSpeakerphoneOn = audioManager2.isSpeakerphoneOn();
        oVar.f356830b = java.lang.Boolean.valueOf(isSpeakerphoneOn);
        return isSpeakerphoneOn;
    }
}
