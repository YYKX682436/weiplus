package w4;

/* loaded from: classes13.dex */
public class d extends w4.c {

    /* renamed from: d, reason: collision with root package name */
    public final android.util.SparseIntArray f442834d;

    /* renamed from: e, reason: collision with root package name */
    public final android.os.Parcel f442835e;

    /* renamed from: f, reason: collision with root package name */
    public final int f442836f;

    /* renamed from: g, reason: collision with root package name */
    public final int f442837g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f442838h;

    /* renamed from: i, reason: collision with root package name */
    public int f442839i;

    /* renamed from: j, reason: collision with root package name */
    public int f442840j;

    /* renamed from: k, reason: collision with root package name */
    public int f442841k;

    public d(android.os.Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new x.b(), new x.b(), new x.b());
    }

    @Override // w4.c
    public w4.c a() {
        android.os.Parcel parcel = this.f442835e;
        int dataPosition = parcel.dataPosition();
        int i17 = this.f442840j;
        if (i17 == this.f442836f) {
            i17 = this.f442837g;
        }
        return new w4.d(parcel, dataPosition, i17, this.f442838h + "  ", this.f442831a, this.f442832b, this.f442833c);
    }

    @Override // w4.c
    public boolean e(int i17) {
        while (this.f442840j < this.f442837g) {
            int i18 = this.f442841k;
            if (i18 == i17) {
                return true;
            }
            if (java.lang.String.valueOf(i18).compareTo(java.lang.String.valueOf(i17)) > 0) {
                return false;
            }
            int i19 = this.f442840j;
            android.os.Parcel parcel = this.f442835e;
            parcel.setDataPosition(i19);
            int readInt = parcel.readInt();
            this.f442841k = parcel.readInt();
            this.f442840j += readInt;
        }
        return this.f442841k == i17;
    }

    @Override // w4.c
    public void i(int i17) {
        int i18 = this.f442839i;
        android.util.SparseIntArray sparseIntArray = this.f442834d;
        android.os.Parcel parcel = this.f442835e;
        if (i18 >= 0) {
            int i19 = sparseIntArray.get(i18);
            int dataPosition = parcel.dataPosition();
            parcel.setDataPosition(i19);
            parcel.writeInt(dataPosition - i19);
            parcel.setDataPosition(dataPosition);
        }
        this.f442839i = i17;
        sparseIntArray.put(i17, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i17);
    }

    public d(android.os.Parcel parcel, int i17, int i18, java.lang.String str, x.b bVar, x.b bVar2, x.b bVar3) {
        super(bVar, bVar2, bVar3);
        this.f442834d = new android.util.SparseIntArray();
        this.f442839i = -1;
        this.f442841k = -1;
        this.f442835e = parcel;
        this.f442836f = i17;
        this.f442837g = i18;
        this.f442840j = i17;
        this.f442838h = str;
    }
}
