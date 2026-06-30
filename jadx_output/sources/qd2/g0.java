package qd2;

/* loaded from: classes2.dex */
public abstract class g0 {

    /* renamed from: a, reason: collision with root package name */
    public int f361737a;

    /* renamed from: b, reason: collision with root package name */
    public final android.hardware.SensorManager f361738b;

    /* renamed from: c, reason: collision with root package name */
    public final android.hardware.Sensor f361739c;

    /* renamed from: d, reason: collision with root package name */
    public final android.hardware.SensorEventListener f361740d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f361741e;

    /* renamed from: f, reason: collision with root package name */
    public final int f361742f;

    /* renamed from: g, reason: collision with root package name */
    public final float[] f361743g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f361744h;

    public g0(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f361737a = -1;
        this.f361743g = new float[3];
        this.f361744h = jz5.h.b(qd2.f0.f361724d);
        java.lang.Object systemService = context.getSystemService("sensor");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.hardware.SensorManager");
        android.hardware.SensorManager sensorManager = (android.hardware.SensorManager) systemService;
        this.f361738b = sensorManager;
        android.hardware.Sensor defaultSensor = sensorManager.getDefaultSensor(1);
        this.f361739c = defaultSensor;
        this.f361742f = 3;
        this.f361740d = defaultSensor != null ? new qd2.e0(this) : null;
    }
}
