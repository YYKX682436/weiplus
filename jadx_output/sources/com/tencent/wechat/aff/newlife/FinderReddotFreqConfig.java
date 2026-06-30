package com.tencent.wechat.aff.newlife;

/* loaded from: classes4.dex */
public class FinderReddotFreqConfig extends com.tencent.mm.protobuf.f {
    private static final com.tencent.wechat.aff.newlife.FinderReddotFreqConfig DEFAULT_INSTANCE = new com.tencent.wechat.aff.newlife.FinderReddotFreqConfig();
    public java.util.LinkedList<com.tencent.wechat.aff.newlife.FinderReddotFreqConfig.ControlItem> control_items = new java.util.LinkedList<>();
    public int stay_entry_min_duration = 0;

    /* loaded from: classes4.dex */
    public static class ControlItem extends com.tencent.mm.protobuf.f {
        private static final com.tencent.wechat.aff.newlife.FinderReddotFreqConfig.ControlItem DEFAULT_INSTANCE = new com.tencent.wechat.aff.newlife.FinderReddotFreqConfig.ControlItem();
        public int n_value = 0;
        public int m_value = 0;

        public static com.tencent.wechat.aff.newlife.FinderReddotFreqConfig.ControlItem create() {
            return new com.tencent.wechat.aff.newlife.FinderReddotFreqConfig.ControlItem();
        }

        public static com.tencent.wechat.aff.newlife.FinderReddotFreqConfig.ControlItem getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.tencent.wechat.aff.newlife.FinderReddotFreqConfig.ControlItem newBuilder() {
            return new com.tencent.wechat.aff.newlife.FinderReddotFreqConfig.ControlItem();
        }

        public com.tencent.wechat.aff.newlife.FinderReddotFreqConfig.ControlItem build() {
            return this;
        }

        @Override // com.tencent.mm.protobuf.f
        public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
            if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.newlife.FinderReddotFreqConfig.ControlItem)) {
                return false;
            }
            com.tencent.wechat.aff.newlife.FinderReddotFreqConfig.ControlItem controlItem = (com.tencent.wechat.aff.newlife.FinderReddotFreqConfig.ControlItem) fVar;
            return n51.f.a(java.lang.Integer.valueOf(this.n_value), java.lang.Integer.valueOf(controlItem.n_value)) && n51.f.a(java.lang.Integer.valueOf(this.m_value), java.lang.Integer.valueOf(controlItem.m_value));
        }

        public int getMValue() {
            return this.m_value;
        }

        public int getM_value() {
            return this.m_value;
        }

        public int getNValue() {
            return this.n_value;
        }

        public int getN_value() {
            return this.n_value;
        }

        public com.tencent.wechat.aff.newlife.FinderReddotFreqConfig.ControlItem mergeFrom(com.tencent.mm.protobuf.f fVar) {
            parseFrom(fVar.getData());
            return this;
        }

        @Override // com.tencent.mm.protobuf.f
        public com.tencent.mm.protobuf.f newInstance() {
            return new com.tencent.wechat.aff.newlife.FinderReddotFreqConfig.ControlItem();
        }

        @Override // com.tencent.mm.protobuf.f
        public final int op(int i17, java.lang.Object... objArr) {
            if (i17 == 0) {
                g36.f fVar = (g36.f) objArr[0];
                fVar.e(1, this.n_value);
                fVar.e(2, this.m_value);
                return 0;
            }
            if (i17 == 1) {
                return b36.f.e(1, this.n_value) + 0 + b36.f.e(2, this.m_value);
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
                this.n_value = aVar2.g(intValue);
                return 0;
            }
            if (intValue != 2) {
                return -1;
            }
            this.m_value = aVar2.g(intValue);
            return 0;
        }

        public com.tencent.wechat.aff.newlife.FinderReddotFreqConfig.ControlItem setMValue(int i17) {
            this.m_value = i17;
            return this;
        }

        public com.tencent.wechat.aff.newlife.FinderReddotFreqConfig.ControlItem setM_value(int i17) {
            this.m_value = i17;
            return this;
        }

        public com.tencent.wechat.aff.newlife.FinderReddotFreqConfig.ControlItem setNValue(int i17) {
            this.n_value = i17;
            return this;
        }

        public com.tencent.wechat.aff.newlife.FinderReddotFreqConfig.ControlItem setN_value(int i17) {
            this.n_value = i17;
            return this;
        }

        public com.tencent.wechat.aff.newlife.FinderReddotFreqConfig.ControlItem mergeFrom(byte[] bArr) {
            parseFrom(bArr);
            return this;
        }

        @Override // com.tencent.mm.protobuf.f
        public com.tencent.wechat.aff.newlife.FinderReddotFreqConfig.ControlItem parseFrom(byte[] bArr) {
            return (com.tencent.wechat.aff.newlife.FinderReddotFreqConfig.ControlItem) super.parseFrom(bArr);
        }
    }

    public static com.tencent.wechat.aff.newlife.FinderReddotFreqConfig create() {
        return new com.tencent.wechat.aff.newlife.FinderReddotFreqConfig();
    }

    public static com.tencent.wechat.aff.newlife.FinderReddotFreqConfig getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.wechat.aff.newlife.FinderReddotFreqConfig newBuilder() {
        return new com.tencent.wechat.aff.newlife.FinderReddotFreqConfig();
    }

    public com.tencent.wechat.aff.newlife.FinderReddotFreqConfig addAllElementControlItems(java.util.Collection<com.tencent.wechat.aff.newlife.FinderReddotFreqConfig.ControlItem> collection) {
        this.control_items.addAll(collection);
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderReddotFreqConfig addAllElementControl_items(java.util.Collection<com.tencent.wechat.aff.newlife.FinderReddotFreqConfig.ControlItem> collection) {
        this.control_items.addAll(collection);
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderReddotFreqConfig addElementControlItems(com.tencent.wechat.aff.newlife.FinderReddotFreqConfig.ControlItem controlItem) {
        this.control_items.add(controlItem);
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderReddotFreqConfig addElementControl_items(com.tencent.wechat.aff.newlife.FinderReddotFreqConfig.ControlItem controlItem) {
        this.control_items.add(controlItem);
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderReddotFreqConfig build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.newlife.FinderReddotFreqConfig)) {
            return false;
        }
        com.tencent.wechat.aff.newlife.FinderReddotFreqConfig finderReddotFreqConfig = (com.tencent.wechat.aff.newlife.FinderReddotFreqConfig) fVar;
        return n51.f.a(this.control_items, finderReddotFreqConfig.control_items) && n51.f.a(java.lang.Integer.valueOf(this.stay_entry_min_duration), java.lang.Integer.valueOf(finderReddotFreqConfig.stay_entry_min_duration));
    }

    public java.util.LinkedList<com.tencent.wechat.aff.newlife.FinderReddotFreqConfig.ControlItem> getControlItems() {
        return this.control_items;
    }

    public java.util.LinkedList<com.tencent.wechat.aff.newlife.FinderReddotFreqConfig.ControlItem> getControl_items() {
        return this.control_items;
    }

    public int getStayEntryMinDuration() {
        return this.stay_entry_min_duration;
    }

    public int getStay_entry_min_duration() {
        return this.stay_entry_min_duration;
    }

    public com.tencent.wechat.aff.newlife.FinderReddotFreqConfig mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.newlife.FinderReddotFreqConfig();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, this.control_items);
            fVar.e(2, this.stay_entry_min_duration);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.g(1, 8, this.control_items) + 0 + b36.f.e(2, this.stay_entry_min_duration);
        }
        if (i17 == 2) {
            this.control_items.clear();
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
        if (intValue != 1) {
            if (intValue != 2) {
                return -1;
            }
            this.stay_entry_min_duration = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            com.tencent.wechat.aff.newlife.FinderReddotFreqConfig.ControlItem controlItem = new com.tencent.wechat.aff.newlife.FinderReddotFreqConfig.ControlItem();
            if (bArr != null && bArr.length > 0) {
                controlItem.parseFrom(bArr);
            }
            this.control_items.add(controlItem);
        }
        return 0;
    }

    public com.tencent.wechat.aff.newlife.FinderReddotFreqConfig setControlItems(java.util.LinkedList<com.tencent.wechat.aff.newlife.FinderReddotFreqConfig.ControlItem> linkedList) {
        this.control_items = linkedList;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderReddotFreqConfig setControl_items(java.util.LinkedList<com.tencent.wechat.aff.newlife.FinderReddotFreqConfig.ControlItem> linkedList) {
        this.control_items = linkedList;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderReddotFreqConfig setStayEntryMinDuration(int i17) {
        this.stay_entry_min_duration = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderReddotFreqConfig setStay_entry_min_duration(int i17) {
        this.stay_entry_min_duration = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderReddotFreqConfig mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.wechat.aff.newlife.FinderReddotFreqConfig parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.newlife.FinderReddotFreqConfig) super.parseFrom(bArr);
    }
}
