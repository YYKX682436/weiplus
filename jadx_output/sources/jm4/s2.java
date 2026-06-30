package jm4;

/* loaded from: classes11.dex */
public class s2 extends com.tencent.unit_rc.BaseObject implements jm4.q2 {

    /* renamed from: d, reason: collision with root package name */
    public bw5.eq0 f300424d = bw5.eq0.values()[0];

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f300425e = "";

    /* renamed from: f, reason: collision with root package name */
    public jm4.q3 f300426f = jm4.q3.f300412n;

    /* renamed from: g, reason: collision with root package name */
    public boolean f300427g;

    @Override // jm4.q2
    public void K(jm4.q3 playTaskType) {
        kotlin.jvm.internal.o.g(playTaskType, "playTaskType");
        this.f300426f = playTaskType;
        notifyFieldUpdated(2);
    }

    @Override // jm4.q2
    public java.lang.String M4() {
        return this.f300425e;
    }

    @Override // jm4.q2
    public void W5(boolean z17) {
        this.f300427g = z17;
        notifyFieldUpdated(3);
    }

    @Override // jm4.q2
    public void aa(bw5.eq0 appId) {
        kotlin.jvm.internal.o.g(appId, "appId");
        this.f300424d = appId;
        notifyFieldUpdated(0);
    }

    @Override // jm4.q2
    public bw5.eq0 getAppId() {
        return this.f300424d;
    }

    @Override // jm4.q2
    public void pf(java.lang.String appName) {
        kotlin.jvm.internal.o.g(appName, "appName");
        this.f300425e = appName;
        notifyFieldUpdated(1);
    }

    @Override // jm4.q2
    public boolean u1() {
        return this.f300427g;
    }

    @Override // jm4.q2
    public jm4.q3 z3() {
        return this.f300426f;
    }
}
