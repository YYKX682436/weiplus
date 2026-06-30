package gg;

/* loaded from: classes7.dex */
public interface d extends nd.b {
    static gg.d getInstance() {
        gg.d dVar = (gg.d) nd.f.a(gg.d.class);
        return dVar == null ? gg.b.getInstance() : dVar;
    }

    gg.c createClientProxy();
}
