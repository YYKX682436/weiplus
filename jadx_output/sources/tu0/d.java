package tu0;

/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public tu0.b f422080a;

    /* renamed from: b, reason: collision with root package name */
    public tu0.g f422081b;

    public d(tu0.a audioEncodeFormat, java.lang.String filePath, int i17, int i18, int i19) {
        kotlin.jvm.internal.o.g(audioEncodeFormat, "audioEncodeFormat");
        kotlin.jvm.internal.o.g(filePath, "filePath");
        int ordinal = audioEncodeFormat.ordinal();
        if (ordinal == 0) {
            tu0.h hVar = new tu0.h();
            hVar.init(filePath, i17, i18, i19);
            this.f422080a = hVar;
        } else if (ordinal == 1) {
            tu0.i iVar = new tu0.i();
            iVar.init(filePath, i17, i18, i19);
            this.f422080a = iVar;
        } else if (ordinal == 2) {
            tu0.g gVar = new tu0.g(i17, i19);
            gVar.b(filePath);
            this.f422081b = gVar;
        }
        tu0.b bVar = this.f422080a;
        if (bVar != null) {
            bVar.f422075a = new tu0.c();
        }
    }

    public final void a() {
        tu0.b bVar = this.f422080a;
        if (bVar != null) {
            ((tu0.h) bVar).a(new byte[0], 0, true);
        }
        tu0.b bVar2 = this.f422080a;
        if (bVar2 != null) {
            bVar2.close();
        }
        this.f422080a = null;
        tu0.g gVar = this.f422081b;
        if (gVar != null) {
            gVar.d();
        }
        this.f422081b = null;
    }
}
