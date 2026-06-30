package jc3;

/* loaded from: classes7.dex */
public class z0 implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        com.tencent.mm.plugin.magicbrush.api.WxaMagicPkgInfo wxaMagicPkgInfo = new com.tencent.mm.plugin.magicbrush.api.WxaMagicPkgInfo();
        wxaMagicPkgInfo.f147858d = parcel.readString();
        wxaMagicPkgInfo.f147859e = parcel.readString();
        wxaMagicPkgInfo.f147860f = parcel.readString();
        wxaMagicPkgInfo.f147861g = parcel.readString();
        wxaMagicPkgInfo.f147862h = parcel.readString();
        wxaMagicPkgInfo.f147863i = parcel.readString();
        wxaMagicPkgInfo.f147864m = parcel.readInt();
        wxaMagicPkgInfo.f147865n = parcel.readString();
        wxaMagicPkgInfo.f147866o = parcel.readString();
        wxaMagicPkgInfo.f147867p = parcel.readString();
        wxaMagicPkgInfo.f147868q = parcel.readLong();
        wxaMagicPkgInfo.f147869r = parcel.readLong();
        return wxaMagicPkgInfo;
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.magicbrush.api.WxaMagicPkgInfo[i17];
    }
}
