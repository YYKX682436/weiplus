package ou0;

/* loaded from: classes5.dex */
public final class c extends ou0.b {
    @Override // ou0.b
    public void a(float f17) {
        this.f348885c += f17;
    }

    @Override // ou0.b
    public float b(float f17, float f18, float f19) {
        boolean z17 = f19 > this.f348884b;
        float abs = java.lang.Math.abs(f17 - f18);
        float f27 = this.f348883a;
        com.tencent.maas.base.Vec2 vec2 = this.f348886d;
        if (z17) {
            vec2.f47799x = abs;
            vec2.f47800y = java.lang.Math.abs(abs - f27);
        } else {
            vec2.f47799x = -abs;
            vec2.f47800y = -java.lang.Math.abs(abs - f27);
        }
        return vec2.f47799x;
    }

    @Override // ou0.b
    public boolean c() {
        return java.lang.Math.abs(this.f348885c) <= this.f348883a * ((float) 2);
    }
}
