package nz4;

/* loaded from: classes12.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public int f341619a;

    /* renamed from: b, reason: collision with root package name */
    public int f341620b;

    /* renamed from: c, reason: collision with root package name */
    public int f341621c;

    /* renamed from: d, reason: collision with root package name */
    public int f341622d;

    /* renamed from: e, reason: collision with root package name */
    public final lz4.a f341623e;

    public h(lz4.a aVar) {
        this.f341623e = aVar;
        this.f341619a = -1;
        this.f341620b = -1;
        this.f341621c = -1;
        this.f341622d = -1;
    }

    public int a() {
        int i17;
        int i18;
        int i19;
        int i27 = this.f341619a;
        if (i27 >= 0 && (i17 = this.f341620b) >= 0 && (i18 = this.f341621c) >= 0 && (i19 = this.f341622d) >= 0 && i27 <= i18 && (i27 != i18 || i17 <= i19)) {
            lz4.a aVar = this.f341623e;
            iz4.c l17 = ((com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI) aVar).J1.l(i27);
            iz4.c l18 = ((com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI) aVar).J1.l(this.f341621c);
            if (l17 != null && l18 != null) {
                int i28 = this.f341619a;
                int i29 = this.f341621c;
                if (i28 == i29 && this.f341620b == this.f341622d) {
                    return 1;
                }
                return (i28 == i29 && l17.d() == 1) ? 2 : 3;
            }
        }
        return 0;
    }

    public java.lang.String toString() {
        return "NoteSelectInfo{sp=" + this.f341619a + ", so=" + this.f341620b + ", ep=" + this.f341621c + ", eo=" + this.f341622d + '}';
    }

    public h(lz4.a aVar, int i17, int i18, int i19, int i27) {
        this.f341623e = aVar;
        this.f341619a = i17;
        this.f341620b = i18;
        this.f341621c = i19;
        this.f341622d = i27;
    }
}
