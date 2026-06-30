package com.tencent.wechat.aff.newlife;

/* loaded from: classes2.dex */
public class FinderGuestInfo extends com.tencent.mm.protobuf.f {
    private static final com.tencent.wechat.aff.newlife.FinderGuestInfo DEFAULT_INSTANCE = new com.tencent.wechat.aff.newlife.FinderGuestInfo();
    public int guest_type = 0;
    public int show_type = 0;

    /* loaded from: classes.dex */
    public enum GuestType implements com.tencent.mm.protobuf.h {
        Guest_Type_None(0),
        Guest_Type_Biz(1);

        public static final int Guest_Type_Biz_VALUE = 1;
        public static final int Guest_Type_None_VALUE = 0;
        public final int value;

        GuestType(int i17) {
            this.value = i17;
        }

        public static com.tencent.wechat.aff.newlife.FinderGuestInfo.GuestType forNumber(int i17) {
            if (i17 == 0) {
                return Guest_Type_None;
            }
            if (i17 != 1) {
                return null;
            }
            return Guest_Type_Biz;
        }

        @Override // com.tencent.mm.protobuf.h
        public final int getNumber() {
            return this.value;
        }

        public static com.tencent.wechat.aff.newlife.FinderGuestInfo.GuestType valueOf(int i17) {
            return forNumber(i17);
        }
    }

    /* loaded from: classes.dex */
    public enum ShowType implements com.tencent.mm.protobuf.h {
        Show_Type_Biz_Profile(1);

        public static final int Show_Type_Biz_Profile_VALUE = 1;
        public final int value;

        ShowType(int i17) {
            this.value = i17;
        }

        public static com.tencent.wechat.aff.newlife.FinderGuestInfo.ShowType forNumber(int i17) {
            if (i17 != 1) {
                return null;
            }
            return Show_Type_Biz_Profile;
        }

        @Override // com.tencent.mm.protobuf.h
        public final int getNumber() {
            return this.value;
        }

        public static com.tencent.wechat.aff.newlife.FinderGuestInfo.ShowType valueOf(int i17) {
            return forNumber(i17);
        }
    }

    public static com.tencent.wechat.aff.newlife.FinderGuestInfo create() {
        return new com.tencent.wechat.aff.newlife.FinderGuestInfo();
    }

    public static com.tencent.wechat.aff.newlife.FinderGuestInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.wechat.aff.newlife.FinderGuestInfo newBuilder() {
        return new com.tencent.wechat.aff.newlife.FinderGuestInfo();
    }

    public com.tencent.wechat.aff.newlife.FinderGuestInfo build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.newlife.FinderGuestInfo)) {
            return false;
        }
        com.tencent.wechat.aff.newlife.FinderGuestInfo finderGuestInfo = (com.tencent.wechat.aff.newlife.FinderGuestInfo) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.guest_type), java.lang.Integer.valueOf(finderGuestInfo.guest_type)) && n51.f.a(java.lang.Integer.valueOf(this.show_type), java.lang.Integer.valueOf(finderGuestInfo.show_type));
    }

    public int getGuestType() {
        return this.guest_type;
    }

    public int getGuest_type() {
        return this.guest_type;
    }

    public int getShowType() {
        return this.show_type;
    }

    public int getShow_type() {
        return this.show_type;
    }

    public com.tencent.wechat.aff.newlife.FinderGuestInfo mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.newlife.FinderGuestInfo();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.guest_type);
            fVar.e(2, this.show_type);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.guest_type) + 0 + b36.f.e(2, this.show_type);
        }
        if (i17 == 2) {
            c36.a aVar = new c36.a((byte[]) objArr[0], com.tencent.mm.protobuf.f.unknownTagHandler);
            for (int nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar); nextFieldNumber > 0; nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar)) {
                if (!super.populateBuilderWithField(aVar, this, nextFieldNumber)) {
                    aVar.b();
                }
            }
            return 0;
        }
        if (i17 != 3) {
            return -1;
        }
        c36.a aVar2 = (c36.a) objArr[0];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            this.guest_type = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        this.show_type = aVar2.g(intValue);
        return 0;
    }

    public com.tencent.wechat.aff.newlife.FinderGuestInfo setGuestType(int i17) {
        this.guest_type = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderGuestInfo setGuest_type(int i17) {
        this.guest_type = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderGuestInfo setShowType(int i17) {
        this.show_type = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderGuestInfo setShow_type(int i17) {
        this.show_type = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderGuestInfo mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.wechat.aff.newlife.FinderGuestInfo parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.newlife.FinderGuestInfo) super.parseFrom(bArr);
    }
}
